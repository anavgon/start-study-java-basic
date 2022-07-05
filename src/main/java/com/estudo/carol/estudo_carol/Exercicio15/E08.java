package com.estudo.carol.estudo_carol.Exercicio15;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor do produto 1");
         double v1 = scan.nextDouble();

         System.out.println("Entre com o valor do produto 2");
        double v2 = scan.nextDouble();

        System.out.println("Entre com o valor do produto 3");
        double v3 = scan.nextDouble();

        if (v1 <= v2 && v1 <= v3){
            System.out.println("Compre o produto 1");
        }else if (v2 <= v1 && v2 <= v3) {
            System.out.println("Compre o produto 2");
        }else if (v3 <= v2 && v3 <= v1) {
            System.out.println("Compre o produto 3");
        }
    }

}
