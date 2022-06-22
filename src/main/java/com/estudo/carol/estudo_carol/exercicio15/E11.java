package com.estudo.carol.estudo_carol.exercicio15;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salario: ");
        double salario = scan.nextDouble();

        int percentual = 0;
        if (salario <= 280) {
            percentual = 20;
        } else if (salario > 280 && salario <= 700) {
            percentual = 15;
        } else if (salario > 700 && salario <= 1500) {
            percentual = 10;
        } else if (salario >= 1500) {
            percentual = 5;
        }
        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;

        System.out.println("Salario: " + salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + aumento);
        System.out.println("Salario Ajustado: " + salarioAjustado);
    }
}
