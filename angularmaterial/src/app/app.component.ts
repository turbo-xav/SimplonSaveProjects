import { UserService } from './user.service';
import { Component, DoCheck, OnInit } from '@angular/core';
import { Observable, of, Subject } from 'rxjs';
import { map } from 'rxjs/operators';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit, DoCheck {


  title = 'app';
  checked = false;

  page: String = 'home';

  /*subject = new Subject<string>();*/


  /*public  constructor(private userService: UserService) {

  }*/

  ngOnInit(): void {

    // We subscribe to the subject
    /*this.subject.subscribe((data) => {
      console.log('Subscriber got data >>>>> ' + data);
    });

    const squares: Observable<any> = of(this.userService).pipe(
      map(n => this.userService.getUsers())

    );

    const observer = {
      next(value) { console.log('value', value); }
    };

    const locationsSubscription = this.subject.subscribe(observer);*/

    /*const secondsCounter = interval(1000);
    secondsCounter.subscribe(n =>
      console.log(`It's been ${n} seconds since subscribing!`)
    );*/
  }

  ngDoCheck(): void {
    // this.subject.next('Eureka');

    // console.log(this.page, this.checked);
  }

  go(page: String) {
    this.page = page;
  }
}
