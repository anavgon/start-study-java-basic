package com.estudo.carol.estudo_carol.Exercicio13;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        System.out.println("Conversor metros para centímetros ");

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor: ");

        double metros = scan.nextDouble();
        double cm = (metros * 100);

        System.out.println("o valor " + metros + "m em centimetros é: " + cm +"cm");


    }
}
