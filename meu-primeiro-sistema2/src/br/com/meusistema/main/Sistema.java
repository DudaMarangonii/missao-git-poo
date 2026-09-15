package br.com.meusistema.main;

import br.com.meusistema.model.Carro;

public class Sistema {
    public static void main(String[] args) {
        System.out.println("Iniciando o sistema...");

        Carro meuCarro = new Carro();

        meuCarro.setModelo("Fusca");
        meuCarro.setCor("Azul");
        meuCarro.setVelocidade(-500);
        meuCarro.buzinar();

        Carro carro2 = new Carro();

        carro2.setModelo("Civic");
        carro2.setCor("Vermelho");

        carro2.buzinar();
    }
}