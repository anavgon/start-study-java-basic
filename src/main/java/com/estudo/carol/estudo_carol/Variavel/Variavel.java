package com.estudo.carol.estudo_carol.Variavel;

public class Variavel {
    public static void main(String[] args) {
        String nome = "Carolina";

        boolean morreu = false;
        boolean sobreviveu = true;

        if (morreu)
            System.out.println(nome + " Foi atropelada " + morreu + " e morreu e foi para o inferno");


        if (sobreviveu)
            System.out.println(nome + " Foi atropelada e ficou toda quebrada");

        //! quer dizer uma pergunta negativa,   e && quer dizer uma afirmação

    }
}

class Variavel2 {
    public static void main(String[] args) {
        int idade = 20;
        String nome = "Carolina";
        String nomeDoMeuIrmao = "Tiago";

        System.out.println(nome + " tem " + idade + " anos e seu irmao se chama " + nomeDoMeuIrmao);
    }
}

