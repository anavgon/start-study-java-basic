package com.estudo.carol.estudo_carol.Exercicio17;

import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scan.nextInt();

        System.out.print(num + "! = " + num + " * ");

        int fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado: " + fatorial);
    }
}