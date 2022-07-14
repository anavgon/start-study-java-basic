package com.estudo.carol.estudo_carol.Exercicio17;

import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int num = scan.nextInt();

        boolean primo = true;

        for (int i = 2; i < num; i++ ){
            if(num % i == 0){
                System.out.println("Nao é primo");
                primo = false;
                //break;
            }
        }
        if(primo){
        System.out.println("numero primo");
        }
    }
}
