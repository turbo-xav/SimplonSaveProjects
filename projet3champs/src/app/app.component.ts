import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Application for identity card';

  design = {
    colors: ['red', 'blue', 'green'],
    color:  'blue',
    checked: false
  };

  user = {
    id  : 1           ,
    connected: true   ,
    name:  'Xavier'    ,
    jobTitle: 'Developpeur hors paire',
    photo: 'http://projets-web.fr/wp-content/gallery/cache/53_web20_320x240_dsc_0857.jpg'
  };

  changeName(name) {
    this.user.name
     = name;
  }

  changePhoto(photo) {
    this.user.photo = photo;
  }

  changeJobTitle(job) {
    this.user.jobTitle = job;
  }
  stop(evt: Event) {
    evt.preventDefault();
  }
}
