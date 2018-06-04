import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Application for les cartes de visite';

  user = {
    id: 1         ,
    name: 'Xavier',
    jobTitle: 'Developpeur hors paire',
    photo: 'https://www.sciencespo.fr/sites/default/files/p-le-gales3_1.jpg'
  };

  changeName(name) {
    this.user.name = name;
  }

  changePhoto(photo) {
    this.user.photo = photo;
  }

  changeJobTitle(job) {
    this.user.jobTitle = job;
  }
  stop(evt: Event){
    evt.preventDefault();
  }
}
