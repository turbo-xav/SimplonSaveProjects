import { Component, OnInit } from '@angular/core';
import { BookmarkService } from '../../service/bookmark.service';
import { ActivatedRoute, Router } from '@angular/router';
import BookMark from '../../model/bookMark';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  bookMark: BookMark = new BookMark();

  constructor(private bookMarkService: BookmarkService, private route: ActivatedRoute, private router: Router) { }


  ngOnInit() {
  }

  add() {
    this.bookMarkService.add(this.bookMark).subscribe(
      (val) => {
        this.bookMark = new BookMark();
        this.router.navigateByUrl('/bookmark');
    });
  }

}
