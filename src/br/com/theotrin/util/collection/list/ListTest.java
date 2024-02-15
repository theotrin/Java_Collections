package br.com.theotrin.util.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> roupas = new ArrayList<>();

        roupas.add("camisa");
        roupas.add("calça");
        roupas.add("sorvete");
        roupas.set(2, "sapato");

        //System.out.println(roupas);

        Pessoa theo = new Pessoa("theo", 23);
        Pessoa guido = new Pessoa("guido", 32);
        Pessoa luffy = new Pessoa("luffy", 22);

        List<Pessoa> tripulacao = new ArrayList<Pessoa>();

        tripulacao.add(theo);
        tripulacao.add(guido);
        tripulacao.add(luffy);


        for(Pessoa pessoa: tripulacao){
            System.out.println(pessoa.getNome());
        }


    }
}
