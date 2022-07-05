package com.estudo.carol.estudo_carol.Exercicio15;

import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com um numero");
        int num = scan.nextInt();

        if (num % 2 ==0){
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }
    }
}
