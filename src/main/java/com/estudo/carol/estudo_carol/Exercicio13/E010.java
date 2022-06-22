package com.estudo.carol.estudo_carol.Exercicio13;

import java.util.Scanner;

public class E010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Temperatura em Celsius: ");
        double valorC = scan.nextDouble();

        double valorF = valorC * 1.8 + 32;

        System.out.println("Temperatura em Farenheit é: " + valorF);
    }
}
