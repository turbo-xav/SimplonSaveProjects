import { BookmarkService } from './../../service/bookmark.service';
import { Component, OnInit } from '@angular/core';
import BookMark from '../../model/bookMark';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  bookMark: BookMark = null;

  constructor(private bookMarkService: BookmarkService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {

    const id: String = this.route.snapshot.params.id;

    this.bookMarkService.get(id).subscribe(
      (bookMark) => {
        this.bookMark = bookMark;
        console.log(bookMark);
      }
    );
  }

  update() {
    this.bookMarkService.update(this.bookMark).subscribe(
      (val) => {
        this.router.navigateByUrl('/bookmark');
    });
  }

}
