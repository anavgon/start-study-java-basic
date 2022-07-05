package com.estudo.carol.estudo_carol.Matrizes;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][][] compromissos = new String[31][8][12];

        boolean sair = false;
        byte opcao;
        while (!sair) {
            System.out.println();
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite o para sair.");

            opcao = scan.nextByte();

            if (opcao == 1) { //adicionar compromisso//

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente");
                    }
                }
                boolean horaValido = false;
                int hora = 0;
                while (!horaValido) {
                    System.out.println("Entre com a hora do compromisso(0-8)");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 8) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente");
                    }
                }
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mes do compromisso");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido, digite novamente");
                    }
                }
                dia--;
                mes--;
                System.out.println("Digite o compromisso");
                compromissos[dia][hora][mes] = scan.next();

            } else if (opcao == 2) { //verificar comprisso

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente");
                    }
                }
                boolean horaValido = false;
                int hora = 0;
                while (!horaValido) {
                    System.out.println("Entre com a hora do compromisso (0-8)");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 8) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora invalida, digite novamente");
                    }
                }
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mes do compromisso");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mes invalido, digite novamente");
                    }
                }
                dia--;
                mes--;
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[dia][hora][mes]);

            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opçaos inválida, digite novamente");
            }
        }
    }
}
