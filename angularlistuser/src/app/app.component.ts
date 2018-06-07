import { Component, OnChanges, SimpleChanges, DoCheck } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements DoCheck {

  title: String = 'Application de démo';

  counterClick = 0;
  alert: Boolean = false;
  superAlert: Boolean = false;
  limiteBasse = 5;
  limiteHaute = 10;

  ngDoCheck() {
    this.alert = (this.counterClick >= this.limiteBasse && this.counterClick <= this.limiteHaute);
    this.superAlert = (this.counterClick > this.limiteHaute);
    console.log(this.alert);
  }

  countClick() {
    this.counterClick ++;
    console.log('nombre de click =' + this.counterClick);
  }
}
