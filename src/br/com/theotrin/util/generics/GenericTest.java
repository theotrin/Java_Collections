package br.com.theotrin.util.generics;

public class GenericTest {
    public static void main(String[] args) {

     Objeto<String> frase = new Objeto<String>("o mundo ja foi uma pangeia");

     Objeto<Integer> numero100 = new Objeto<Integer>(100);


        System.out.println(frase.getNome());
        System.out.println(numero100.getNome());
    }






}
