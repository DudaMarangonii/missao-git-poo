package br.com.cybercorp.model;

public class Funcionario {

    private String nome;
    private String cargo;
    private Departamento departamento;

    public Funcionario(String nome, String cargo, Departamento departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + " | Cargo: " + cargo + " | Departamento: " + departamento.getNome();
    }
}