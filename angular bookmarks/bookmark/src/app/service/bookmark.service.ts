import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import BookMark from '../model/bookMark';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class BookmarkService {


  private url = 'https://bnppf1-bookmarks.herokuapp.com/bookmark';

  constructor(private http: HttpClient) {

  }

  getAll(): Observable<BookMark []> {
    return this.http.get<BookMark []>(this.url);
  }

  get(id: String): Observable<BookMark> {
    return this.http.get<BookMark>(this.url + '/' + id);
  }

  update(bookMark: BookMark): Observable<BookMark> {
    return this.http.put<BookMark>(this.url + '/' + bookMark.id, bookMark, httpOptions);
  }

  add(bookMark: BookMark) {
    return this.http.post<BookMark>(this.url, bookMark, httpOptions);
  }

  delete(id: String) {
    return this.http.delete(this.url + '/' + id);
  }
}
