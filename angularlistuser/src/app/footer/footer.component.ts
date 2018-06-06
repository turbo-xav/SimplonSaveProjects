import { MenuComponent } from './../menu/menu.component';
import { Component, OnInit } from '@angular/core';
import { PageService } from '../page.service';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent extends MenuComponent implements OnInit  {

  ngOnInit() {
    this.setLiens('footer');
  }
}
