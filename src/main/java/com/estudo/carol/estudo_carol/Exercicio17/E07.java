package com.estudo.carol.estudo_carol.Exercicio17;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;
        for (int i =0; i <5; i++){

            System.out.println("Entre com um numero:");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
            }
        }
        System.out.println("O maior numero digitadoo foi: " + maior);
    }
}
