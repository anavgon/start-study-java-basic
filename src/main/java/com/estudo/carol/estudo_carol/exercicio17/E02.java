package com.estudo.carol.estudo_carol.exercicio17;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;

        do {

            System.out.println("Nome de usuario: ");
            String usuario = scan.next();

            System.out.println("Entre com a senha: ");
            String senha = scan.next();

            if (usuario.equalsIgnoreCase(senha)){
                System.out.println(" Senha igual a usuário, digite novamente");
            } else {
                infoValida = true;
                System.out.println(" Senha e usuario válidos");
            }

        } while (!infoValida);

    }
}
