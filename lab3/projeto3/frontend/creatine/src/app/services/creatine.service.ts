import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Observer } from 'rxjs';
import { Creatine } from '../model/Creatine';
import { CreatineDTO } from '../model/CreatineDTO';


@Injectable({
  providedIn: 'root'
})

export class CreatineService {

private url:string = "http://localhost:8080/creatines";

  constructor(private http:HttpClient) { }

  listar():Observable<Creatine[]>{
    return this.http.get<Creatine[]>(this.url);
  }

  cadastrar(obj:CreatineDTO):Observable<CreatineDTO>{
    return this.http.post<CreatineDTO>(this.url, obj);
  }

  deletar(id:number):Observable<Creatine>{
    return this.http.delete<Creatine>(`${this.url + "/" + id}`);
  }

  alterar(obj:Creatine):Observable<Creatine>{
    return this.http.put<Creatine>(`${this.url + "/" + obj.id}`, obj)
  }
}
