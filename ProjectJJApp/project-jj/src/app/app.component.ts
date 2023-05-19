import { Component } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { LoginComponent } from './components/login/login.component';
import IUser from './interfaces/user';
import { LoginService } from './services/login.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'project-jj';

  currentUser: IUser;
  opened: boolean = false;


  constructor(private modalService: NgbModal, private loginService: LoginService) {
    this.loginService.currentUser.subscribe(x => this.currentUser = x);
  }

  // ngOnInit(){
  //   this.logout();
  // }

  openLoginForm(): void {
    const modalRef = this.modalService.open(LoginComponent);
  }

  logout(): void {
    this.loginService.logout();
    this.opened = false;
    console.log(this.currentUser);
  }
}
