package org.example.entity;

public class Empresa extends Cliente {

    @Override
    public void emprestar(){
        this.emprestimo = true;
        System.out.println("Empréstimo aprovado para empresas!");
    }
}
