package com.estudo.carol.estudo_carol.Matrizes;

import java.util.Random;
import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);

            }
        }
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.println(numerosAleatorios[i][j] + "");
            }
            System.out.println();
        }
        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 5;
        for (int i = 0; i < numerosAleatorios[5].length; i++) {
            if (numerosAleatorios[5][i] > maiorL5) {
                maiorL5 = numerosAleatorios[5][i];
            }
            if (numerosAleatorios[5][i] < menorL5) {
                menorL5 = numerosAleatorios[linha5][1];
            }
        }
        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);

        int maiorc7 = 0;
        int menorc7 = 101;
        int col7 = 7;
        for (int i = 0; i < numerosAleatorios[7].length; i++) {
            if (numerosAleatorios[7][col7] > maiorc7) {
                maiorc7 = numerosAleatorios[7][col7];
            }
            if (numerosAleatorios[7][col7] < menorc7) {
                menorc7 = numerosAleatorios[col7][col7];
            }
        }
        System.out.println("Maior valor da coluna 7 = " + maiorc7);
        System.out.println("Menor valor da coluna 7 = " + menorc7);
    }
}
