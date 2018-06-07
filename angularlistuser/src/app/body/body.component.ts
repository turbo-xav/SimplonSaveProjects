import { Item } from './../enum/item';
import { environment } from './../../environments/environment';
import { PageService } from './../page.service';
import { Component, OnInit, Input, OnChanges, SimpleChanges, DoCheck, Output, EventEmitter, ElementRef } from '@angular/core';

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.css']
})
export class BodyComponent implements OnInit, OnChanges {

  private secondes: Number;
  @Output() countClick = new EventEmitter<any>();

  page: String;


  item = Item;
  editable: Boolean = false;

  @Input() title;

  ngOnChanges(changes: SimpleChanges): void {
    console.log(Item);
    const keys = Object.keys(this.item);
    console.log(keys);
  }

  show() {
    this.editable = true;
  }

  constructor(private pageService: PageService) {

  }

  ngOnInit() {
  }

  countClickOnMyBody(evt) {
    this.countClick.emit();
  }


  getPage() {
    return  this.pageService.getPage();
  }
}
