package br.com.theotrin.util.collection.set;

import java.util.HashSet;
import java.util.Set;

//Set não aceita valores repetidos

public class setTest {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();
        nomes.add("theo");
        nomes.add("felipe");

        System.out.println(nomes);

    }
}
