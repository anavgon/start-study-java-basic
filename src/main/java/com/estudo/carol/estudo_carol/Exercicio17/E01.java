package com.estudo.carol.estudo_carol.Exercicio17;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {

            System.out.println("Entre com uma nota (1-10):");

            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Voce digitou: " + nota);
            } else {
                System.out.println("Nota inválida,digite novamente.");
            }

        } while (!notaValida);

    }
}
