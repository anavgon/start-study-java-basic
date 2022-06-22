package com.estudo.carol.estudo_carol.Exercicio13;

import java.util.Scanner;
public class E012 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a altura");
        double altura = scan.nextDouble();

        double peso = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + peso);

    }
}
