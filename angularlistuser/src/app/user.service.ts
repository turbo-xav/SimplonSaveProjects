import { Injectable } from '@angular/core';
import { Subject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class User {
  id: Number;
  name: String;
  image: String;
  jobTitle: String;

  constructor(id: Number, name: String, jobTitle: String, image: String) {
    this.id = id;
    this.name = name;
    this.image = image;
    this.jobTitle = jobTitle;
  }

}

export class UserService {

  selectedUser: User = null;
  private myUser: Subject<User> = new Subject<User>();

  public updateAnnounce: Observable<User> = this.myUser.asObservable();

  users = [
    new User(
      1 ,
      'Xavier Tagliarino'  ,
      'Pilote amateur'   ,
      // tslint:disable-next-line:max-line-length
      'https://scontent-cdt1-1.xx.fbcdn.net/v/t1.0-1/p160x160/29512861_10216177973585849_539540110156796661_n.jpg?_nc_cat=0&oh=b90f26fc88f49b682be1cc516ce5d7fc&oe=5B7D4553'
    )
    ,
    new User(2  ,
      'David Checa'   ,
      'Pilote pro'  ,
      'https://www.fsbk.fr/wp-content/uploads/2015/04/5-MANSB-CHECA-2812.jpg'
    )
    ,
    new User(
      3       ,
      'Valentino Rossi'  ,
      'Dieu de la moto' ,
      // tslint:disable-next-line:max-line-length
      'https://i.guim.co.uk/img/media/4fb2821b0aaa2ad1bf1e0594276b931dfaae7de1/0_85_3067_1839/master/3067.jpg?w=300&q=55&auto=format&usm=12&fit=max&s=958d4ae3b3b74e1505861685839d1114'
    )
  ];

  constructor() {
  }

  selectUser(user: User) {
      this.selectedUser = user;
      this.myUser.next(user);
  }

  addUser(user: User) {
    this.users.push(user);
  }
}
