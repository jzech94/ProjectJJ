import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './material/material.module';
import { HomepageComponent } from './components/homepage/homepage.component';
import { LoginComponent } from './components/login/login.component';
import { MenuComponent } from './components/menu/menu.component';
import {APP_BASE_HREF} from '@angular/common';
import {FormsModule} from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AuthInterceptor } from './interceptors/auth.interceptor';
import { DemoComponent } from './components/demo/demo.component';
import { QuizComponent } from './components/quiz/quiz.component';

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    LoginComponent,
    MenuComponent,
    DemoComponent,
    QuizComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [{provide: APP_BASE_HREF, useValue: '/ProjectJJ'}, { provide : HTTP_INTERCEPTORS, useClass : AuthInterceptor, multi : true }],
  bootstrap: [AppComponent]
})
export class AppModule { }
