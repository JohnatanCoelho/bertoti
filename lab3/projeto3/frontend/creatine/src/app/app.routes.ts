import { RouterModule,Routes } from '@angular/router';
import { IndexComponent } from './componentes/pages/index/index.component';
import { NgModule } from '@angular/core';
import { ListaCreatinesComponent } from './componentes/pages/lista-creatines/lista-creatines.component';

export const routes: Routes = [
  {path: "", component:IndexComponent},
  {path: "creatines", component:ListaCreatinesComponent},
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppModule { }
