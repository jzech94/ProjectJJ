import { Component } from '@angular/core';
import IUser from 'src/app/interfaces/user';
import { LoginService } from 'src/app/services/login.service';
import { MenuService } from 'src/app/services/menu.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {

  currentUser: IUser;
  opened: boolean = false;

  constructor(private loginService: LoginService, private menuService: MenuService) {
    this.loginService.currentUser.subscribe(x => this.currentUser = x);
  }


}
