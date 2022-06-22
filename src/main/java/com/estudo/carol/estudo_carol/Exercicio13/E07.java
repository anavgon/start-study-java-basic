package com.estudo.carol.estudo_carol.Exercicio13;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        System.out.println("Insira o valor do lado: ");

        Scanner scan = new Scanner(System.in);

        double lado = scan.nextDouble();
        double area = Math.pow(lado ,2);
        System.out.println("o valor da area é: " + area);


        //FAZER PERGUNTA SE QUER VER O DOBRO
        Scanner scanPerguntaSeQuerODobro = new Scanner(System.in);
        System.out.println("deseja saber o valor do dobro? digite sim ou não");
        String respostaSeQuerOdobro = scanPerguntaSeQuerODobro.next();

        if(respostaSeQuerOdobro.equals("sim")) {
            double dobro = (area * area);
            System.out.println("O dobro da Area é: " + dobro);
        } else {
            System.out.println("Coloca o sim >:c");
        }


    }
}
