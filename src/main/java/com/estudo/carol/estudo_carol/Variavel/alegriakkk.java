package com.estudo.carol.estudo_carol.Variavel;

import java.util.Scanner;

public class alegriakkk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primero numero");
        int valor1 = scan.nextInt();

        System.out.println("Entre com o segundo numero");
        int valor2 = scan.nextInt();

        int resultado = valor1 + valor2;
        System.out.println("a soma dos valores é:" + resultado);
    }
}
