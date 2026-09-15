package br.com.cybercorp.main;

import br.com.cybercorp.model.Credencial;
import br.com.cybercorp.model.Departamento;
import br.com.cybercorp.model.Funcionario;
import br.com.cybercorp.model.SistemaSeguranca;
import br.com.cybercorp.model.Veiculo;

public class MainTeste {

    public static void main(String[] args) {

        Departamento departamento = new Departamento("Tecnologia", "TI-01");

        Funcionario funcionario = new Funcionario(
                "Duda",
                "Engenheira de Software",
                departamento
        );

        Veiculo veiculo = new Veiculo(
                "ABC-1234",
                "Toyota Corolla",
                funcionario
        );

        SistemaSeguranca sistema = new SistemaSeguranca(2);

        Credencial c1 = new Credencial("FFF-999", true, funcionario);

        Credencial clone = new Credencial("FFF-999", true, funcionario);

        sistema.registrarCatraca(funcionario);
        sistema.registrarCatraca(funcionario);

        sistema.acessarCofre(c1);
        sistema.acessarCofre(clone);

        sistema.estacionarVeiculo(veiculo, 0);
        sistema.estacionarVeiculo(veiculo, 5);
    }
}