import { APP_BASE_HREF } from '@angular/common';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { map, Observable } from 'rxjs';
import { environment } from '../models/environment';

@Injectable({
  providedIn: 'root'
})
export class MenuService {

  private baseUrl: string = environment.baseUrl;

  constructor(private http: HttpClient, private router: Router, @Inject(APP_BASE_HREF) private baseHref: string) {
    this.baseUrl = this.baseUrl + this.baseHref;
  }

  public testEndPoint(): Observable<any> {
     return this.http.get<Observable<any>>(`${this.baseUrl}/demo/test`);
  }
}
