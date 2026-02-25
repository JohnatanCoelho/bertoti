package org.example.entity.strategys;

public class Proibido implements Emprestimo{

    @Override
    public boolean emprestar(){
        System.out.println("Empréstimo não permitido!");
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
