package com.estudo.carol.estudo_carol.Exercicio15;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor/hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mes: ");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;

        int percentualIR = 0;
        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else if (salarioBruto > 2500) {
            percentualIR = 20;
        }

        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = inss + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: (" + valorHora + "*" + valorHora + "):" + salarioBruto);
        System.out.println("(-) INSS (10%): " + inss);
        System.out.println("FGTS (11%)" + fgts);
        System.out.println("(-) IR (" + percentualIR + "%):" + ir);
        System.out.println("Total descontos: " + totalDescontos);
        System.out.println("Salario liquido: " + salarioLiquido);
    }
}
