import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';
import { first } from 'rxjs/operators';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import IUser from 'src/app/interfaces/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  showSpinner: any;
  currentUser: IUser;
  model: any = {};
  username: string = '';
  password: string = '';

  constructor(private loginService: LoginService, private modalService: NgbModal) {
    this.loginService.currentUser.subscribe(x => this.currentUser = x);
  }

  ngOnInit() {
  }


  login(): void {
    this.loginService.login(this.model.username, this.model.password)
      .pipe(first())
      .subscribe({
        next(value: any) { },
        error() { alert("Invalid Username and password") },
        complete: () => {
          console.log("successful login");
          this.closeLoginForm();
        }
      })
  }

  closeLoginForm(): void {
    this.modalService.dismissAll(LoginComponent);
  }
}


