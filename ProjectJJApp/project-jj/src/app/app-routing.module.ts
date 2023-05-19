import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DemoComponent } from './components/demo/demo.component';
import { HomepageComponent } from './components/homepage/homepage.component';
import { LoginComponent } from './components/login/login.component';

import { QuizComponent } from './components/quiz/quiz.component';
import { LoginGuard } from './guards/login.guard';

const routes: Routes = [
  {
    path: "", component: HomepageComponent
  },
  {
    path: "login", component: LoginComponent
  },
  {
    path: "demo", component: DemoComponent,  canActivate : [LoginGuard]
  },
  {
    path: "quiz", component: QuizComponent,  canActivate : [LoginGuard]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
