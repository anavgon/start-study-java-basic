package com.estudo.carol.estudo_carol.Exercicio15;

import java.util.Scanner;

public class E23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("entre com o tipo da carne: ");
        System.out.println("1 - file duplo");
        System.out.println("2 - alcatra");
        System.out.println("3 - picanha");
        int tipo = scan.nextInt();

        System.out.println("entre com a quantidade (kg)");
        double qntd = scan.nextDouble();

        double precokg = 0;

        if (tipo == 1) {
            System.out.println(qntd + "kg - file duplo");

            if (qntd < 5) {
                precokg = 4.9;
            } else {
                precokg = 5.8;
            }

        } else if (tipo == 2) {
            System.out.println(qntd + "kg - alcatra");

            if (qntd < 5) {
                precokg = 5.9;
            } else {
                precokg = 6.8;
            }
        } else if (tipo == 3) {
            System.out.println(qntd + "kg - picanha");

            if (qntd < 5) {
                precokg = 6.9;
            } else {
                precokg = 7.8;
            }
        }
        double total = qntd * precokg;
        System.out.println(qntd + "kg * " + precokg + " = " + total);

        System.out.println("compra no cartao? digite 1 para sim:");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) * 5;
            System.out.println("deconto de: " + desconto);
            System.out.println("valor a pagar: " + (total - desconto));
        } else {
            System.out.println("valor a pagar: " + total);
        }
    }
}


