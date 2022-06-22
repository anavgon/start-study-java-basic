package com.estudo.carol.estudo_carol.Exercicio13;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        System.out.println("Área do círculo");

        Scanner scan = new Scanner(System.in);
        System.out.println("Raio do círculo: ");

        double raio = scan.nextDouble();
        double diametro = (raio * raio);
        double area = (3.14 * diametro);

        System.out.println("Área: " + area);

    }

}
