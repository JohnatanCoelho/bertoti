package org.example.entity.strategys;

public class Permitido implements Emprestimo{

    @Override
    public void emprestar(){
        System.out.println("Empréstimo permitido para o cliente!");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
