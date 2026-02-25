package org.example.entity;

import org.example.entity.strategys.Emprestimo;
import org.example.entity.strategys.Permitido;

public class Cliente {

    private String nome;
    private Emprestimo emprestimo;

    public Cliente(String nome){
        this.nome = nome;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void chamarEmprestimo(){

        if(emprestimo.equals(new Permitido())){

            emprestimo.emprestar();

        } else{

            emprestimo.emprestar();
        }
    }
}
