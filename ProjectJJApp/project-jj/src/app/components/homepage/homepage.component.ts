import { Component } from '@angular/core';
import { Router } from '@angular/router';
import IUser from 'src/app/interfaces/user';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent {
  currentUser: IUser;

  constructor(private router: Router, private loginService: LoginService) { 
    this.loginService.currentUser.subscribe(x => this.currentUser = x);
  }

  ngOnInit() {
  }


}
