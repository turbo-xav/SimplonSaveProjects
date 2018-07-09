import { BookmarkService } from './service/bookmark.service';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ListComponent as BookMarkList } from './bookmark/list/list.component';
import { EditComponent as BookMarkEdit } from './bookmark/edit/edit.component';
import { AddComponent as BookMarkAdd } from './bookmark/add/add.component';

import { ListComponent as TagList } from './tag/list/list.component';
import { ListComponent as ProfilList } from './profil/list/list.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'profile', component: ProfilList },
  { path: 'bookmark', component: BookMarkList },
  { path: 'bookmark/add', component: BookMarkAdd },
  { path: 'bookmark/:id', component: BookMarkEdit } ,
  { path: 'tag', component: TagList}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
