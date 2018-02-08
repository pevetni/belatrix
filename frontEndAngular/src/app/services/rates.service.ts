import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { HttpHeaders, HttpClient } from '@angular/common/http';

@Injectable()
export class RatesService {

    _urlEur = 'http://api.fixer.io/latest?base=USD&symbols=EUR';
    _urlAll = 'http://api.fixer.io/latest?base=USD';

    constructor(private _http: HttpClient) {}

    getAllRates(): Observable<any> {
        let rates: Observable<any>;
        const headers = new HttpHeaders().
        set('Accept', 'application/json')
        .append('Content-Type', 'application/json')
        .append('Cache-Control', 'no-cache')
        .append('Pragma', 'no-cache');

        try {
            rates = this._http.get<any[]>(this._urlAll, { headers }).share();
        } catch (error) {
            console.log(error);
        }

        return rates;
    }

    getEurPrice(): Observable<any> {
        let rate: Observable<any>;
        const headers = new HttpHeaders().
        set('Accept', 'application/json')
        .append('Content-Type', 'application/json')
        .append('Cache-Control', 'no-cache')
        .append('Pragma', 'no-cache');

        try {
            rate = this._http.get<any[]>(this._urlEur, { headers }).share();
        } catch (error) {
            console.log(error);
        }

        return rate;
    }
}
