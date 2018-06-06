import { UserService, User } from './../user.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-useradd',
  templateUrl: './useradd.component.html',
  styleUrls: ['./useradd.component.css']
})
export class UseraddComponent implements OnInit {

  editable: Boolean = true;

  newUser: User = {
    id: null,
    name: null,
    jobTitle: null,
    image: null
  };

  constructor(private userServService: UserService) { }

  ngOnInit() {
  }

  addUser() {
    this.userServService.addUser(this.newUser);
  }

  displayForm() {
    this.editable = true;
  }

}
