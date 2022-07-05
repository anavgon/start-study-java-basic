package com.estudo.carol.estudo_carol.Exercicio15;

import java.util.Scanner;

public class E22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade em kilos de morangos ");
        double qntmorango = scan.nextDouble();

        System.out.println("Entre com a quantidade em kilos de maça ");
        double qntmaca = scan.nextDouble();

        double precoKgMorango = 0;

        if (qntmorango <= 5) {
            precoKgMorango = 2.5;
        } else {
            precoKgMorango = 2.2;
        }

        double precoKgMaca = 0;
        if (qntmaca <= 5) {
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }

        double precoTotalMorango = qntmorango * precoKgMorango;
        double precoTotalMaca = qntmaca * precoKgMaca;

        double precoParcial = precoTotalMorango + precoTotalMaca;
        double precoTotal = precoParcial;

        if ((qntmorango + qntmaca > 8) || precoParcial > 25) {
            precoTotal = precoParcial - ((precoParcial / 100) * 10);

        }
        System.out.println(" Preco total=" + precoTotal);
    }
}
