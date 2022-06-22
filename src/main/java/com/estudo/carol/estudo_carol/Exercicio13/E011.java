package com.estudo.carol.estudo_carol.Exercicio13;

import java.util.Scanner;

public class E011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int num1 = scan.nextInt();

        System.out.println("Digite um outro numero inteiro");
        int num2 = scan.nextInt();

        System.out.println("Digite um numero real");
        double num3 = scan.nextDouble();

        int resultado1 = (num1 * 2) * (num2 / 2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = Math.pow(num3, 3);

        System.out.println("o produto do dobro do primeiro com metade do segundo é: " + resultado1);
        System.out.println("a soma do triplo do primeiro com o terceiro é: " + resultado2);
        System.out.println("o terceiro elevado ao cubo é: " + resultado3);
    }
}
