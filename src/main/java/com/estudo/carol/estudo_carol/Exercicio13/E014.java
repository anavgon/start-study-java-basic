package com.estudo.carol.estudo_carol.Exercicio13;

import java.util.Scanner;

public class E014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo: ");
        double tamArquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet: ");
        double vellInternet = scan.nextDouble();

        double tempo = tamArquivo / vellInternet;

        System.out.println("Tempo de dowlond: " + tempo);

    }
}
