package com.estudo.carol.estudo_carol.ifEelse;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Entre com a idade");

        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }*/
        //barato <= 10
        //10 < valor < 15 - pedir desconto
        // 15 <+ valor 17 - pesquisar mais
        //>= 17 - muito caro

        System.out.println("Preço do item");
        double valor = scan.nextDouble();

        if (valor <=10) {
            System.out.println("Está barato, pode comprar");
        } else if (valor > 10 && valor < 15){
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("pode pesquisar mais");
        } else {
            System.out.println("Muito caro");

        }

    }
}