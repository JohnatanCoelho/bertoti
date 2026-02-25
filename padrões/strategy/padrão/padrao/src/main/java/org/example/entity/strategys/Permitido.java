package org.example.entity.strategys;

public class Permitido implements Emprestimo{

    @Override
    public boolean emprestar(){
        System.out.println("Empréstimo permitdo!");
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
