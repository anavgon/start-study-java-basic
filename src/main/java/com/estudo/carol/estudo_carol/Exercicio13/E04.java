package com.estudo.carol.estudo_carol.Exercicio13;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" 1 periodo: ");
        double valor1 = scan.nextDouble();

        System.out.println(" 2 periodo: ");
        double valor2 = scan.nextDouble();

        System.out.println(" 3 periodo: ");
        double valor3 = scan.nextDouble();

        System.out.println(" 4 periodo: ");
        double valor4 = scan.nextDouble();

        double resultado = (valor1 + valor2 + valor3 + valor4);
        System.out.println(" Sua média é: " + resultado);
    }
}
