import { PageService } from './page.service';
import { UserService } from './user.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { UserlistComponent } from './userlist/userlist.component';
import { UserdetailComponent } from './userdetail/userdetail.component';
import { UseraddComponent } from './useradd/useradd.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { BodyComponent } from './body/body.component';
import { MenuComponent } from './menu/menu.component';


@NgModule({
  // On y met les component pour l'affichage HTML
  declarations: [
    AppComponent,
    UserlistComponent,
    UserdetailComponent,
    UseraddComponent,
    HeaderComponent,
    FooterComponent,
    BodyComponent,
    MenuComponent
  ],
  // On ne met que les module
  imports: [
    BrowserModule,
    FormsModule
  ],
  // On met les services qui vont permettre
  providers: [
    UserService,
    PageService
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }
