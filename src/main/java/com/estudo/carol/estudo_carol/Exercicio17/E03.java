package com.estudo.carol.estudo_carol.Exercicio17;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, genero, civil;
        int idade;
        double salario;

        do {
            System.out.println("Entre com o nome: ");
            nome = scan.next();

            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa no minimo 3 caracteres");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com a idade:");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("idade precisa ser entre 0 a 150");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o salario");
            salario = scan.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Desculpe  nao aceitamos pobres");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o genero");
            genero = scan.next();

            if (genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Genero precisa ser 'f' oui 'm'");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o Estado civil");
            civil = scan.next();

            if (civil.equalsIgnoreCase("s") || civil.equalsIgnoreCase("c") || civil.equalsIgnoreCase("v") || civil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("Genero precisa ser 's', 'c', 'v' ou 'd'" );
            }
        } while (!infoValida);

    }
}
