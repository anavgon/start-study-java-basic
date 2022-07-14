package com.estudo.carol.estudo_carol.Exercicio17;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("entre com o primeiro numero");
        int num1 = scan.nextInt();

        System.out.println("entre com o segundo numero");
        int num2 = scan.nextInt();

        for (int i = num1; i<=num2; i++){
            System.out.println(i);
        }
    }
}
