import { APP_BASE_HREF } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import IUser from '../interfaces/user';
import { environment } from '../models/environment';
import { User } from '../models/user';



@Injectable({
    providedIn: 'root'
})
export class LoginService {
    private currentUserSubject: BehaviorSubject<User>;
    public currentUser: Observable<User>;
    public user:User = new User;
    private baseUrl:string = environment.baseUrl;

    constructor(private http: HttpClient, private router: Router, @Inject(APP_BASE_HREF) private baseHref:string) {
        this.baseUrl = this.baseUrl + this.baseHref;
        this.currentUserSubject = new BehaviorSubject<User>(JSON.parse(localStorage.getItem('currentUser') ?? '{}'));
        this.currentUser = this.currentUserSubject.asObservable();
    }
    public getCurrentUserValue(): User {
        return this.currentUserSubject.value;
    }

    login(userName: string, password: string) :Observable<any> {
        return this.http.post<any>(`${this.baseUrl}/auth/login`, { userName, password })
            .pipe(map(userToken => {
                // store user details and jwt token in local storage to keep user logged in between page refreshes
                window.sessionStorage.setItem("access_token", userToken.access_token)
                this.router.navigateByUrl("/")
                localStorage.setItem('currentUser', JSON.stringify(userToken));
                if(userToken.access_token.length > 0){
                    console.log(JSON.parse(atob(userToken.access_token.split('.')[1])).sub);
                    this.user.userName = JSON.parse(atob(userToken.access_token.split('.')[1])).sub;
                }
                this.currentUserSubject.next(this.user);
                return userToken;
            }));
    }


    logout() :void {
        // remove user from local storage and set current user to null
        window.sessionStorage.removeItem("access_token");
        localStorage.removeItem('currentUser');
        this.currentUserSubject.next(null);
        this.router.navigateByUrl("/");
    }
}
