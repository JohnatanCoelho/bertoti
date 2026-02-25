package org.example.entity;

public class Estudante extends Cliente {

    @Override
    public void emprestar(){

        System.out.println("Empréstimo reprovado para estudante!");
    }
}
