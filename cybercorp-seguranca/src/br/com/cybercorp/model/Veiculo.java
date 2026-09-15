package br.com.cybercorp.model;

public class Veiculo {

    private String placa;
    private String modelo;
    private Funcionario proprietario;

    public Veiculo(String placa, String modelo, Funcionario proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Funcionario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Funcionario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Veículo: " + modelo + " | Placa: " + placa;
    }
}