package com.estudo.carol.estudo_carol.Exercicio13;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mes: ");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;

        System.out.println(" O salário é de: " + salario );

    }
}
