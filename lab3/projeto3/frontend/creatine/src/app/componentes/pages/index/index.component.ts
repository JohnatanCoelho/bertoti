import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreatineService } from '../../../services/creatine.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CreatineDTO } from '../../../model/CreatineDTO';



@Component({
  selector: 'app-index',
  standalone: true,
  imports: [CommonModule, FormsModule, HttpClientModule],
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent {

  creatine:CreatineDTO = new CreatineDTO();

  creatines:CreatineDTO[] = [];

  btnCadastro:boolean = true;

  constructor(private services:CreatineService){}

  cadastrar():void{

    this.services.cadastrar(this.creatine).subscribe(retorno =>
       {this.creatines.push(retorno);});
  }

}
