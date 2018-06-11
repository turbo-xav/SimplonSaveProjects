import { UserService } from './../user.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Location } from '@angular/common';
import { User } from '../user';

@Component({
  selector: 'app-useradd',
  templateUrl: './useradd.component.html',
  styleUrls: ['./useradd.component.css']
})
export class UseraddComponent implements OnInit {

  private user: User;

  constructor(private route: ActivatedRoute,
    private userService: UserService,
    private location: Location,
  private router: Router) { }

  ngOnInit() {
    console.log('je passe');
    this.user = this.userService.getUser(this.route.snapshot.paramMap.get('id'));
  }

  getUser() {
    return this.user;
  }
  updateUser(user) {
    this.userService.updateUser(user);
    this.router.navigateByUrl('/user');
  }


}
