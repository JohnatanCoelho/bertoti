package org.example;

import org.example.entity.ClienteComum;
import org.example.entity.Estudante;

public class main {

    public static void main(String [] args){

        ClienteComum clienteComum = new ClienteComum();
        Estudante estudante = new Estudante();

        clienteComum.emprestar();
        estudante.emprestar();

    }
    
}
