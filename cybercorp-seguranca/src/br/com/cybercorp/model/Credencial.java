package br.com.cybercorp.model;

import java.util.Objects;

public class Credencial {

    private String codigoHex;
    private boolean ativa;
    private Funcionario titular;

    public Credencial(String codigoHex, boolean ativa, Funcionario titular) {
        this.codigoHex = codigoHex;
        this.ativa = ativa;
        this.titular = titular;
    }

    public String getCodigoHex() {
        return codigoHex;
    }

    public void setCodigoHex(String codigoHex) {
        this.codigoHex = codigoHex;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public Funcionario getTitular() {
        return titular;
    }

    public void setTitular(Funcionario titular) {
        this.titular = titular;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Credencial credencial = (Credencial) obj;

        return Objects.equals(codigoHex, credencial.codigoHex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoHex);
    }

    @Override
    public String toString() {
        return "Credencial: " + codigoHex + " | Ativa: " + ativa;
    }
}