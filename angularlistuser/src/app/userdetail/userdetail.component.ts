import { Component, OnInit, Input } from '@angular/core';
import { UserService, User } from './../user.service';

@Component({
  selector: 'app-userdetail',
  templateUrl: './userdetail.component.html',
  styleUrls: ['./userdetail.component.css']
})
export class UserdetailComponent implements OnInit {

user: User;

constructor(private userServService: UserService) {
  this.userServService.updateAnnounce.subscribe(
    (user: User) => {this.user = user; }, // si OK},
    () => {}// si ko}
  );
 }

ngOnInit() {
}

getUser() {
    return this.userServService.selectedUser;
  }
}
