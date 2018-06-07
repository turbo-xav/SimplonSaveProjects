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

  getPages(type: String): Lien[] {
    return this.pages.filter(lien => lien.getType() === type);
  }

  getPage() {
    return this.page ? this.page : this.pages[0];
  }

  constructor() {
    this.pages.push(  new Lien( 'home'      , 'Home'            , 'Welcome to my home page '          , 'home page content',  'header' ) );
    this.pages.push(  new Lien( 'listusers' , 'List of pilots'  , 'Welcome to my list of pilots page' , null,  'header' ) );
    this.pages.push(  new Lien( 'contact'   , 'Contact'         , 'Welcome to my contact page'        , 'contact content',  'header' ) );
    this.pages.push(  new Lien( 'lexique'   , 'Lexique'         , 'Welcome to my lexique page'        , 'lexique content',  'footer' ) );
    this.pages.push(  new Lien( 'mentions'  ,  'Mentions'       , 'Welcome to my mentions page'       , 'mentions content',  'footer' ) );
  }
}
