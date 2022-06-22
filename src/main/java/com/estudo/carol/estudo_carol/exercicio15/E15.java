package com.estudo.carol.estudo_carol.exercicio15;

import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o lado 1: ");
        int lado1 = scan.nextInt();

        System.out.println("Entre com o lado 2: ");
        int lado2 = scan.nextInt();

        System.out.println("Entre com o lado 3: ");
        int lado3 = scan.nextInt();

        if (((lado1 + lado2 > lado3) ||
                ((lado1 + lado3 > lado2) ||
                        ((lado2 + lado3) > lado1)))){

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triangulo Equilatero");

            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("Triangulo Escaleno");

            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triangulo Isoceles");
            } else {
                System.out.println("Nao forma um triangulo");

            }
        }

    }
}

