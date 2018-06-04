import { Component, OnInit } from '@angular/core';
import { Person } from '../Person';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit {

  persons: Person[];

  selectedPerson: Person;

  selectPerson(p: Person) {
    this.selectedPerson = p;
    console.log(this.selectedPerson.name);
  }

  constructor() {
    this.persons = [{ id: 11, name: 'Mr. Nice' },
    { id: 12, name: 'Narco' },
    { id: 13, name: 'Bombasto' },
    { id: 14, name: 'Celeritas' },
    { id: 15, name: 'Magneta' },
    { id: 16, name: 'RubberMan' },
    { id: 17, name: 'Dynama' },
    { id: 18, name: 'Dr IQ' },
    { id: 19, name: 'Magma' },
    { id: 20, name: 'Tornado' }
  ];

   }

  ngOnInit() {
  }

  changePerson(value) {
    this.selectedPerson.name = value;
  }



}
