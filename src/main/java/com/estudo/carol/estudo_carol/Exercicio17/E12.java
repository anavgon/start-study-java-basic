package com.estudo.carol.estudo_carol.Exercicio17;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero para gerar a tabuada");
        int num = scan.nextInt();

        System.out.println("Tabuada" + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + " = " + (num * i));

        }
    }
}
