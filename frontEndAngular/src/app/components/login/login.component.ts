import { Component, OnInit } from '@angular/core';
import { SecurityService } from '../../services/security.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  model: any = {};

  constructor(private _securityService: SecurityService, private router: Router) {


  }

  ngOnInit() {}

  login() {
    /* this._securityService.Login(this.model.username, this.model.password)
            .subscribe(
                data => {
                    this.router.navigate(['principal']);
                },
                error => {
                    // mostrar error
                }); */
                this.router.navigate(['principal']);
  }
}
