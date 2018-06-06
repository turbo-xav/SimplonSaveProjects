import { MenuComponent } from './../menu/menu.component';
import { Component, OnInit, AfterContentChecked } from '@angular/core';
import { PageService } from './../page.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent extends MenuComponent implements OnInit {
  ngOnInit() {
    this.setLiens('header');
  }
}
