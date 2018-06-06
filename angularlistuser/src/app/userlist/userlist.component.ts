import { UserService, User } from './../user.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {

  constructor(public userService: UserService) { }

  users = [];

  ngOnInit() {
      this.users = this.userService.users;
      this.selectUser(this.users[Math.floor(Math.random() * Math.floor(this.users.length))]);
  }

  selectUser(user: User) {
    this.userService.selectUser(user);
  }
}
