package org.example.entity;

public class ClienteComum extends Cliente {

    @Override
    public void emprestar(){
        this.emprestimo = false;
        System.out.println("Empréstimo reprovado para clientes comuns!");
    }
}
