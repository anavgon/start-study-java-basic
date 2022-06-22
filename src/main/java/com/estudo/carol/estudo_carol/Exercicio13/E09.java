package com.estudo.carol.estudo_carol.Exercicio13;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Temperatura em Farenheit: ");
        double valorF = scan.nextDouble();

        double valorC = 5 * (valorF - 32) / 9;

        System.out.println("Temperatura em Celsius é: " + valorC);


    }
}
