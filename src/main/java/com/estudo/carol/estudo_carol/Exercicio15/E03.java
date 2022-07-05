package com.estudo.carol.estudo_carol.Exercicio15;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com seu sexo");
        String input = scan.next();

        if (input.equalsIgnoreCase("mulher")) {
            System.out.println("F - feminino");
        } else if (input.equalsIgnoreCase("homem")) {
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo invalido");
        }
    }
}
