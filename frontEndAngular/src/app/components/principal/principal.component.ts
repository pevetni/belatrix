import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Rx';
import { Rates, Rate } from '../../models/rates';
import { RatesService } from '../../services/rates.service';

@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html',
  styleUrls: ['./principal.component.css']
})
export class PrincipalComponent implements OnInit {

  model: any = {};
  rate$: Observable<any>; // Almacenara el objeto que contiene el precio del EUR
  allRates$: Observable<any>; // Observable que almecena todas las cotizaciones
  arrayRates: any; // Arreglo principal con todas las cotizaciones

  // Estos dos arreglos se utilizan para almacenar el arreglo anterior a la mitad
  arrayRates1 = new Array();
  arrayRates2 = new Array();

  constructor(private _ratesService: RatesService) {}

  ngOnInit() {
    // Se crea un timer con ejecucion cada 10 minutos
    const timer = Observable.timer(0, 600000);
    // se realiza la subscripcion al timer y dentro se llama el servicio que obtiene
    // las cotizaciones
    this.allRates$ = timer.flatMap(x => this.getAllRates()).share();

    // Se subscribe al observable que tiene las cotizaciones para que cada vez que cambie el
    // cambio se vea reflejado en pantalla
    this.allRates$.subscribe(x => {
      console.log(x.tasa);
      this.orderRates(x);
    });
    this.rate$ = this._ratesService.getEurPrice();
  }

  calcular() {
    // me subscribo al observable que obtiene el valor del EUR
    this.rate$.subscribe(x => this.model.eur = x.tasa.EUR * this.model.usd );
  }

  getAllRates(): Observable<any> {
    return this._ratesService.getAllRates();
  }

  private orderRates(rates: any) {
    let i = 0;
    this.arrayRates = new Array();
    // tslint:disable-next-line:forin
    for (const key in rates.tasa) {
      const value = rates.tasa[key];
      this.arrayRates.push(new Rate(key, value));
      i++;
    }

    this.arrayRates1 = this.arrayRates.slice(0, this.arrayRates.length / 2 === 0 ?
                                                this.arrayRates.length / 2 :
                                                this.arrayRates.length / 2 + 0.5);

    this.arrayRates2 = this.arrayRates.slice( this.arrayRates.length / 2 === 0 ?
                                              this.arrayRates.length / 2 :
                                              this.arrayRates.length / 2 + 0.5, this.arrayRates.length);
  }
}
