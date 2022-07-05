package com.estudo.carol.estudo_carol.ArraySimples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor A da posiçao: " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {

            System.out.println("Entre com o valor B da posiçao: " + i);
            vetorB[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println("Vetor A = ");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.println("Vetor B =");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(df.format(vetorB[i])+ "");
        }
        System.out.println();

        System.out.println("Vetor C =");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(df.format(vetorC[i])+ "");
        }
        System.out.println();
    }
}
