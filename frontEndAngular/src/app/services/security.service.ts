import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class SecurityService {

    constructor(private _router: Router, private http: HttpClient) {}

    Login(usr: string, pwd: string): Observable<boolean> {
        const creds = `grant_type=password&username=${usr}&password=${pwd}`;
        const headers = new HttpHeaders().set('Content-Type', 'application/x-www-form-urlencoded');

        return this.http.post(`localhost:8080/login`, creds, {
            headers: headers, responseType: 'text'
        }).map(resp => {
            // const json = resp !== '' ? JSON.parse(resp) : undefined;
            return true;
        });
    }
}
