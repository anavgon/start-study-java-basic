package com.estudo.carol.estudo_carol.Exercicio13;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite valor 1 : ");

        int valor1 = scan.nextInt();
        System.out.println("Digite valor 2: ");
        int valor2 = scan.nextInt();
        int resultado = valor1 + valor2;

        System.out.println("A soma deles é: " + resultado);

    }
}
