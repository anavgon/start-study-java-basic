package com.estudo.carol.estudo_carol.exercicio15;

import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o ano");

        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 00 && ano % 100 != 0)) {
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }

    }
}
