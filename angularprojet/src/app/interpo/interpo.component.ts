import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-interpo',
  templateUrl: './interpo.component.html',
  styleUrls: ['./interpo.component.css']
})
export class InterpoComponent implements OnInit {

  usr = {
    id: 0,
    name: 'Michel François',
    image: 'https://s3.amazonaws.com/uifaces/faces/twitter/malykhinv/128.jpg',
    jobTitle: 'Customer Division Assistant'
  };

  persons = [
    {
      name : 'Xav'
    },
    {
      name : 'Fred'
    }
  ];

  constructor() {
  }

  ngOnInit() {
  }

  testClick(e: MouseEvent) {
    e.preventDefault();
    console.log('Click :', this.usr);
    console.log('X =' + e.clientX);
  }

  callTestClick(e: MouseEvent) {
    e.preventDefault();
    this.testClick(e);
  }

  callTestMouseOver(e: MouseEvent) {
    e.preventDefault();
    console.log('Mouse Over :', this.usr);
    console.log('X =' + e.clientX);
  }

  recupInput(e) {
    console.log(e.target.value);
  }

  recupInputValue(value) {
    console.log(value);
  }

  selectPerson(person) {
    console.log(person);
  }
}
