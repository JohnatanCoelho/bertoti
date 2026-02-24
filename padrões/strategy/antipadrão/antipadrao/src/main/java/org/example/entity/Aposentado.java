package org.example.entity;

public class Aposentado extends Cliente {

    @Override
    public void emprestar(){
        this.emprestimo = true;
        System.out.println("Empréstimo aprovado para aposentados!");
    }
}
