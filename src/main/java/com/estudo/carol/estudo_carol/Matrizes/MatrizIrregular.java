package com.estudo.carol.estudo_carol.Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero de pessoas que serao entrevistados");
        int numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i= 0; i< nomesFilhos.length; i++){

            System.out.println("Entre com a quantidade de filhos");
            int qntFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qntFilhos];

            for (int j=0;j<nomesFilhos[i].length; j++){

                System.out.println("Digite o nome do filho " +(j+i));

                nomesFilhos[i][j]= scan.next();
            }
        }
        for (int i =0; i< nomesFilhos.length; i++){
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
            for (int j=0; j<nomesFilhos[i].length ; j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}
