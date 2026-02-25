package org.example.entity;

public class ClienteComum extends Cliente {

    @Override
    public void emprestar(){
        System.out.println("Empréstimo reprovado para clientes comuns!");
    }
}
