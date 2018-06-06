import { environment } from './../../environments/environment';
import { PageService } from './../page.service';
import { Component, OnInit, Input, OnChanges, SimpleChanges, DoCheck, Output, EventEmitter, ElementRef } from '@angular/core';


@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.css']
})
export class BodyComponent implements OnInit, OnChanges, DoCheck  {

  private secondes: Number;


  @Output() add = new EventEmitter<any>();

  page: String;

  editable: Boolean = false;

  @Input() title;

  show() {
    this.editable = true;
  }

  constructor(private pageService: PageService) {

  }

  ngOnInit() {
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log(changes);
  }

  addEvent(evt) {
    this.add.emit(null);
  }

  ngDoCheck() {
    console.log('fuck');
  }


  getPage() {
    return  this.pageService.getPage();
  }
}
