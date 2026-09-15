package br.com.banco.model;

public class ContaBancaria {

    private Cliente cliente;
    private double saldo;

    public ContaBancaria(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
        Agencia.registrarNovaConta();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        double total = valor + Agencia.TAXA_SAQUE;

        if (saldo >= total) {
            saldo -= total;
            return true;
        }

        return false;
    }
}
