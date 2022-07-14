package com.estudo.carol.estudo_carol.Exercicio17;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("entre com o primeiro numero");
        int num1 = scan.nextInt();

        System.out.println("entre com o segundo numero");
        int num2 = scan.nextInt();

        int soma = 0;
        for (int i = num1; i <= num2; i++) {
           soma += i;
        }
        System.out.println("Soma " + soma);
    }
}
