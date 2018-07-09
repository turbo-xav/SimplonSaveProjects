import { BookmarkService } from './../../service/bookmark.service';
import { Component, OnInit } from '@angular/core';
import BookMark from '../../model/bookMark';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  bookMarks: BookMark[] = [];

  constructor( private  bookMarkService: BookmarkService, private route: ActivatedRoute, private router: Router) {

  }

  ngOnInit() {

    this.bookMarkService.getAll().subscribe(
      (list) => {
        this.bookMarks = list;
      }
    );
  }

  delete(id: String) {
    this.bookMarkService.delete(id).subscribe(
    (val) => {

        this.bookMarkService.getAll().subscribe(
          (list) => {
            this.bookMarks = list;
          }
        );
    }
  );
  }
}
