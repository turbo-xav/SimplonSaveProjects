import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {DateAdapter, MAT_DATE_FORMATS, MAT_DATE_LOCALE} from '@angular/material/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { MatIconModule,
        MatCheckboxModule,
        MatAutocompleteModule,
        MatDatepickerModule,
        MatFormFieldModule,
        MatNativeDateModule,
        MatInputModule,
        MatMenu,
        MatMenuModule,
        MatToolbarModule,
        MatTableModule,
        MatButtonModule
} from '@angular/material';
import { UserComponent } from './user/user.component';
import { UseraddComponent } from './useradd/useradd.component';
import { BioComponent } from './bio/bio.component';
import {FlexLayoutModule} from '@angular/flex-layout';
import { NavComponent } from './nav/nav.component';
import { RouterModule, Routes } from '@angular/router';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { MentionsComponent } from './mentions/mentions.component';

const routes: Routes = [
                          { path: '', component: HomeComponent},
                          { path: 'bio', component: BioComponent},
                          { path: 'contact', component: ContactComponent},
                          { path: 'user', component: UserComponent},
                          { path: 'user/:id', component: UseraddComponent},
                          { path: 'mentions', component: MentionsComponent},
                        ];

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    UseraddComponent,
    BioComponent,
    NavComponent,
    ContactComponent,
    HomeComponent,
    MentionsComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    MatIconModule,
    MatCheckboxModule,
    MatAutocompleteModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    MatMenuModule,
    MatToolbarModule,
    MatTableModule,
    MatButtonModule,
    FlexLayoutModule,
    RouterModule.forRoot(routes)
  ],
  exports: [],
  providers: [{provide: MAT_DATE_LOCALE, useValue: 'fr-FR'}],
  bootstrap: [AppComponent]
})
export class AppModule { }
