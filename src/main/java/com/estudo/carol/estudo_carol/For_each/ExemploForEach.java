package com.estudo.carol.estudo_carol.For_each;

import java.util.ArrayList;
import java.util.List;

public class ExemploForEach {
    public static void main(String[] args) {
        String[] nomes = {"Carolina", "Lais","Thiago", "Danilo"};
        List<Integer> valores = new ArrayList<Integer>();
        valores.add(20);
        valores.add(21);
        valores.add(16);
        valores.add(16);

        Integer index = 0;
        //Pecorre um array.
        for(String nome : nomes){
            System.out.println(nome + " tem " + valores.get(index));
            ++index;
        }
    }
}
