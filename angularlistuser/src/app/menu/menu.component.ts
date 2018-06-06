import { Component, OnInit, Inject, Input } from '@angular/core';
import { PageService } from '../page.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  private liens = [];

  @Input() listLiens;

  constructor(private pageService: PageService) {
  }

  ngOnInit() {
  }

  goTo(page) {
    this.pageService.setPage(page);
  }

  getContenu() {
    return this.pageService.getPage();
  }

  setLiens(type) {
    this.liens = this.pageService.getPagesType(type);
  }

  getLiens() {
    return this.liens;
  }
}
