package org.example.entity.strategys;

public class Proibido implements Emprestimo{

    @Override
    public void emprestar(){
        System.out.println("Empréstimo não permitido para o cliente!");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
