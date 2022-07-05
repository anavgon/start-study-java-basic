package com.estudo.carol.estudo_carol.Exercicio17;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean valido = false;

        double popA;
        double popB;
        double taxaA;
        double taxaB;

        do{
            System.out.println("Entre com a populaçao A: ");
            popA = scan.nextDouble();

            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("Populaçao A precisa ser maior que 0");
            }

        }while (!valido);

        valido = false;
        do{
            System.out.println("Entre com a Taxa da populaçao A: ");
            taxaA = scan.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento A precisa ser maior que 0");
            }

        }while (!valido);


        do{
            System.out.println("Entre com a populaçao B: ");
            popB = scan.nextDouble();

            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("Populaçao B precisa ser maior que 0");
            }

        }while (!valido);

         valido = false;
        do{
            System.out.println("Entre com a Taxa da populaçao B: ");
            taxaB = scan.nextDouble();

            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("Taxa de crescimento B precisa ser maior que 0");
            }

        }while (!valido);

        int cont = 0;

        while (popA < popB) {
            popA += (popA / 100) * taxaA;
            popB += (popA / 100) * taxaB;
            cont++;
        }
        System.out.println("Populaçao A:" + popA);
        System.out.println("Populaçao B:" + popB);
        System.out.println("Quantidade de anos:  " + cont);
    }
}

