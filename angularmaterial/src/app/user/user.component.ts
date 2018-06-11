import { UserService } from './../user.service';
import { Component, OnInit, DoCheck } from '@angular/core';
import { User } from '../user';
import { Subject, Observable } from 'rxjs';
import { DataSource, CollectionViewer } from '@angular/cdk/collections';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})

export class UserComponent implements OnInit, DoCheck {

  constructor(public userService: UserService) { }

  displayedColumns = ['id', 'name', 'job', 'action'];

  users: User[];

  user: User;

  maSource = new MyUsers(this.userService);


  public myUsers: Subject<User[]> = new Subject<User[]>();

  public updateAnnounce: Observable<User[]> = this.myUsers.asObservable();


  getUsers() {
    return this.userService.getUsers();
  }

  ngOnInit() {

    this.users = this.userService.getUsers();
    this.user = this.users[0];
  }

  public remove(user) {
    this.userService.remove(user);
  }

  ngDoCheck(): void {
    this.users = this.userService.getUsers();
  }


}

export class MyUsers implements DataSource<User> {



  constructor(private userService: UserService) {

  }


  connect(): Observable<User[]> {
    return this.userService.updateAnnounce;
  }
  disconnect(collectionViewer: CollectionViewer): void {
    return null;
    // throw new Error("Method not implemented.");
  }
}
