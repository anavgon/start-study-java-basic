package com.estudo.carol.estudo_carol.exercicio15;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual turno você estuda? (M-T-N)");

        String horas = scan.next();
        if (horas.equalsIgnoreCase("M")) {
            System.out.println("Bom dia!!");
        } else if (horas.equalsIgnoreCase("T")) {
            System.out.println("Boa tarde!!");
        } else if (horas.equalsIgnoreCase("N")) {
            System.out.println("Boa noite!!");
        } else {
            System.out.println("Valor invalido");
        }
    }
}

