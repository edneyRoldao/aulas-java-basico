package com.edn.javabasico.orientacao_objetos.aminais;

public class Test {

    public static void main(String[] args) {
        Gato g = new Gato();
        Cachorro c = new Cachorro();
        Ave a = new Ave();

        AcaoAnimal aa = new AcaoAnimal();

        aa.replicarSom(g);
        aa.replicarSom(c);
        aa.replicarSom(a);
    }

}
