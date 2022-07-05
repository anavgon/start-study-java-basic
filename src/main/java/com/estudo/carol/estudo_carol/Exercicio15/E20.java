package com.estudo.carol.estudo_carol.Exercicio15;

import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vitima? ");
        String resp1 = scan.next();

        System.out.println("Esteve no local do crime? ");
        String resp2 = scan.next();

        System.out.println("Mora perto da vitima? ");
        String resp3 = scan.next();

        System.out.println("Ja trabalhou com a vista? ");
        String resp4 = scan.next();

        System.out.println("Devia pra vitima? ");
        String resp5 = scan.next();

        int cont = 0;

        if (resp1.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp2.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp3.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp4.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp5.equalsIgnoreCase("S")) {
            cont++;
        }
        if (cont == 2) {
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cumplice");
        } else if (cont == 5) {
            System.out.println("Assassino");
        } else if (cont == 0) {
            System.out.println("Inocente");
        }
    }
}
