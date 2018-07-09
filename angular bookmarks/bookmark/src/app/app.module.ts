import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MyNavComponent } from './my-nav/my-nav.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule, MatButtonModule, MatSidenavModule, MatIconModule, MatListModule, MatInputModule } from '@angular/material';
import { HomeComponent } from './home/home.component';
import { ListComponent as BookMarkListComponent } from './bookmark/list/list.component';
import { EditComponent as BookMarkEditComponent } from './bookmark/edit/edit.component';
import { ListComponent as TagListComponent } from './tag/list/list.component';
import { ListComponent as ProfilListComponent } from './profil/list/list.component';

import { MatChipsModule} from '@angular/material';

import { HttpClientModule } from '@angular/common/http';
import { MatFormFieldModule} from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';
import { AddComponent } from './bookmark/add/add.component';


@NgModule({
  declarations: [
    AppComponent,
    MyNavComponent,
    HomeComponent,
    BookMarkListComponent,
    TagListComponent,
    ProfilListComponent,
    BookMarkEditComponent,
    AddComponent,
 ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    HttpClientModule,
    MatChipsModule,
    MatFormFieldModule,
    FormsModule,
    MatInputModule,
    MatIconModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
