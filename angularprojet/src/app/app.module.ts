import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { InterpoComponent } from './interpo/interpo.component';
import { PersonComponent } from './person/person.component';

@NgModule({
  declarations: [
    AppComponent,
    InterpoComponent,
    PersonComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
