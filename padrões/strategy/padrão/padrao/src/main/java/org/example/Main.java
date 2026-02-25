package org.example;

import org.example.entity.Cliente;
import org.example.entity.strategys.Permitido;
import org.example.entity.strategys.Proibido;

public class Main {
    public static void main(String[] args) {

        Cliente joao = new Cliente();

        // Permitindo empréstimo
        joao.setEmprestimo(new Permitido());
        joao.chamarEmprestimo();

        // Negando empréstimo
        joao.setEmprestimo(new Proibido());
        joao.chamarEmprestimo();
    }
}
