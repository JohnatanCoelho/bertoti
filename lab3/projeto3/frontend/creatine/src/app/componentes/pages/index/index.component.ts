import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreatineService } from '../../../services/creatine.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CreatineDTO } from '../../../model/CreatineDTO';
import { Creatine } from '../../../model/Creatine';



@Component({
  selector: 'app-index',
  standalone: true,
  imports: [CommonModule, FormsModule, HttpClientModule],
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent {

  creatinedto:CreatineDTO = new CreatineDTO();

  creatine:Creatine = new Creatine();

  creatinesDTO:CreatineDTO[] = [];

  creatines:Creatine[] = []

  tabelaView:Boolean = true;

  constructor(private services:CreatineService){}

  cadastrar():void{

    //Colocando dentro do creatineDTO pois o ID será gerado automaticamente
        this.creatinedto = {
            image: this.creatine.image,
            name: this.creatine.name,
            shortDescription: this.creatine.shortDescription,
            price: this.creatine.price
        }

    this.services.cadastrar(this.creatinedto).subscribe(retorno =>
       {this.creatinesDTO.push(retorno);});

       // Reiniciando os inputs
       this.creatine = new Creatine();
       location.reload();
  }

  listar():void{
    this.services.listar().subscribe(retorno => this.creatines = retorno);
  }

  editar():void{
    this.services.alterar(this.creatine).subscribe(
      retorno => {
        let posicao = this.creatines.findIndex(
        obj => { obj.id === this.creatine.id}
        );
       this.creatines[posicao] = retorno;
      });

       // Reiniciando os inputs
      this.creatine = new Creatine();

      this.tabelaView = true;
  }

  selecionar(posicao:number):void{
    //Tabela fica invisível
    this.tabelaView = false;

    this.creatine = this.creatines[posicao];
  }

  ngOnInit(){
    this.listar();
  }

}
