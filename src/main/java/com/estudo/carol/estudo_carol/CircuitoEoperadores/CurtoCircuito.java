package com.estudo.carol.estudo_carol.CircuitoEoperadores;

public class CurtoCircuito {
    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & falso;
        boolean resultado2 = verdadeiro && verdadeiro;
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
