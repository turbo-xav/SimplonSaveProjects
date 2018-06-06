import { Injectable } from '@angular/core';
import { Lien } from './model/lien';

@Injectable({
  providedIn: 'root'
})
export class PageService {

  pages = [];
  page;

  setPage(page) {
    this.page = page;
  }

  getPagesType(type: String) {
    const pages = [];
    for (const pageIndex in this.pages) {
      if (this.pages[pageIndex].getType() === type) {
        pages.push(this.pages[pageIndex]);
      }
    }
    return pages;
  }

  getPage() {
    return this.page ? this.page : this.pages[0];
  }

  constructor() {
    this.pages.push(new Lien( 'home'      , 'Home'       ,  'header' ));
    this.pages.push(new Lien( 'listusers' , 'List users' ,  'header' ));
    this.pages.push(new Lien( 'contact'   , 'Contact'    ,  'header' ));
    this.pages.push(new Lien( 'lexique'   , 'Lexique'    ,  'footer' ));
    this.pages.push(new Lien( 'mentions'  ,  'Mentions'  ,  'footer' ));
  }
}
