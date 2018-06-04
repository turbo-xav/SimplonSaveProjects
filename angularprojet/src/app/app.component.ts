import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: String = 'app';
  name = 'Turbo Xav';
  user = {
    name: 'Xav'     ,
    job: 'Devlopper'
  };
}
