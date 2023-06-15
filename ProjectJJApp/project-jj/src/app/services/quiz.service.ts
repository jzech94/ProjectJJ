import { APP_BASE_HREF } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import IQuestion from '../interfaces/question';
import { environment } from '../models/environment';

@Injectable({
  providedIn: 'root'
})
export class QuizService {

  private baseUrl: string = environment.baseUrl;

  constructor(private http: HttpClient, private router: Router, @Inject(APP_BASE_HREF) private baseHref: string) {
    this.baseUrl = this.baseUrl + this.baseHref;
  }

  getAllQuestions():Observable<IQuestion[]>{
    return this.http.get<IQuestion[]>(`${this.baseUrl}/quiz/findAll`);
  }
}
