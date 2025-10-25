import { Component } from '@angular/core';
import { CreatineService } from '../../../services/creatine.service';
import { Creatine } from '../../../model/Creatine';
import { FormsModule } from "@angular/forms";
import { NgFor } from '@angular/common';



@Component({
  selector: 'app-lista-creatines',
  standalone: true,
  imports: [FormsModule, NgFor],
  templateUrl: './lista-creatines.component.html',
  styleUrl: './lista-creatines.component.css'
})
export class ListaCreatinesComponent {

  creatines:Creatine[] = [];

  constructor(private services:CreatineService){}

  selecionar():void{
    this.services.selecionar().subscribe(retorno => this.creatines = retorno);
  }

  deletar(id: number):void{
    this.services.deletar(id).subscribe(retorno => {this.creatines.filter(c => c.id != id)});
  }

  ngOnInit(){
    this.selecionar();

  }

}

