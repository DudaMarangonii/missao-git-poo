package br.com.banco.main;

import br.com.banco.model.Agencia;
import br.com.banco.model.Cliente;
import br.com.banco.model.ContaBancaria;

public class MainTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Duda", "12345678900", "duda@email.com");
        Cliente cliente2 = new Cliente("Maria", "12345678900", "maria@email.com");

        if (cliente1.equals(cliente2)) {
            System.out.println("Os clientes são iguais!");
        }

        ContaBancaria conta = new ContaBancaria(cliente1, 50.0);

        boolean resultado = conta.sacar(50.0);

        System.out.println("Saque realizado: " + resultado);

        System.out.println("Total de contas abertas: " + Agencia.getTotalContasAbertas());
    }
}