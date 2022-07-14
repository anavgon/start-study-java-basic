package com.estudo.carol.estudo_carol.Exercicio17;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        double media;
        int soma = 0;
        for (int i =0; i <5; i++){
            System.out.println("Digite um numero:");
            num = scan.nextInt();

            soma += num;
        }

        media = soma /5;
        System.out.println("Soma:" + soma);
        System.out.println("Media:" + media);
    }
}
