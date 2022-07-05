package com.estudo.carol.estudo_carol.Exercicio15;

import java.util.Scanner;

public class E21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a qtd de litros vendidos");
        double litro = scan.nextDouble();

        System.out.println("Entre com o tipo de combustível");
        String tipo = scan.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesc = 0;

        if (tipo.equalsIgnoreCase("a")) {

            if (litro <= 20) {
                percDesconto = 3;
            } else {
                percDesconto = 5;
            }

            total = litro * precoAlc;
            if (tipo.equalsIgnoreCase("g")) {

                if (litro <= 20) {
                    percDesconto = 4;
                } else {
                    percDesconto = 6;
                }

                totalDesc = litro * precoGas;
            }
            totalDesc = (total/100) * percDesconto;

            double precoAPagar = total - totalDesc;
            System.out.println("Valor a ser pago: " + precoAPagar);
        }
    }
}