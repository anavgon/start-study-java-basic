package com.estudo.carol.estudo_carol.exercicio15;

import java.util.Scanner;

public class E19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("entre com o segundo número:");
        int num2 = scan.nextInt();

        System.out.println("entre com uma operaçao (+ - / *): ");
        String operaçao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (operaçao) {
            case "+":
                resultado = (num1 + num2);
                break;
            case "-":
                resultado = (num1 - num2);
                break;
            case "/":
                resultado = (num1 / num2);
                break;
            case "*":
                resultado = (num1 * num2);
                break;
            default:
                System.out.println("Operaçao invalida");
                valida = false;
        }
        if (valida){
            System.out.println("resultado:" + resultado);

            if (resultado >= 0) {
                System.out.println("resultado positivo");
            } else {
                System.out.println("resultado negativo");
            }
            if (resultado % 2 == 0) {
                System.out.println("resultado par");
            } else {
                System.out.println("resultado impar");
            }
        }
    }
}
