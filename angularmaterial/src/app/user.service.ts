import { Injectable, DoCheck } from '@angular/core';
import { User } from './user';
import { Subject, Observable } from 'rxjs';
import { DataSource, CollectionViewer } from '@angular/cdk/collections';


@Injectable({
  providedIn: 'root'
})



export class UserService {

private users: User[] = [];

private user: User;


public myUsers: Subject<User> = new Subject<User>();

public updateAnnounce: Observable<User> = this.myUsers.asObservable();



constructor() {

  /*this.users.push(new User('1', 'Xavier', 'Turbo Xaviste'));
  this.users.push(new User('2', 'Magali', 'Hondazakiste'));
  this.users.push(new User('3', 'Tiago', 'Mecanozakiste'));
*/


  this.updateAnnounce.subscribe(
      (user: User) => {
        this.users.push(user);
      }, // si OK},
      () => {}// si ko}
    );

    this.myUsers.next(new User('1', 'Xavier', 'Turbo Xaviste'));
    this.myUsers.next(new User('2', 'Magali', 'Hondazakiste'));
    this.myUsers.next(new User('3', 'Tiago', 'Mecanozakiste'));

  }

 

  public getUsers() {
    return this.users;
  }

  public setUser(user: User) {
    this.user = user;
  }

  public getUser(id) {
    /*for ( let i = 0 ; i <= this.users.length ; i++) {
      if ( id === this.users[i].id ) {
            return this.users[i];
      }
    }*/

    return this.users.find(function(user) {
      return (user.id === id);
    });
  }

  public remove(user: User) {
    const index =  this.users.indexOf(user);
    this.users.splice(index, 1);
  }

  public updateUser(user: User) {
    const index =  this.users.indexOf(user);
    this.users[index] = user;
  }
}
