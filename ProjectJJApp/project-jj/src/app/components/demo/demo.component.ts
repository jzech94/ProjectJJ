import { Component } from '@angular/core';
import IUser from 'src/app/interfaces/user';
import { LoginService } from 'src/app/services/login.service';
import { MenuService } from 'src/app/services/menu.service';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css']
})
export class DemoComponent {

  currentUser: IUser;
  testString: string;
  opened:boolean = false;

  videoId = 'dQw4w9WgXcQ';

  constructor(private loginService: LoginService, private menuService: MenuService) {
    this.loginService.currentUser.subscribe(x => this.currentUser = x);
  }

  ngOnInit() {
    console.log(this.currentUser.userName);
  }

  testEndPoint(): void {
    this.menuService.testEndPoint().subscribe(
      {
        next: (res) => { this.testString = res.message; },
        error: (err) => { console.log(err); },
        complete: () => { console.log('work complete'); }
      }
    );
  }

}
