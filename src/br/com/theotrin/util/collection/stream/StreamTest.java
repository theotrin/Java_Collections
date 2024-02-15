package br.com.theotrin.util.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> chapeusDePalha = new ArrayList<String>();

        chapeusDePalha.add("Luffy");
        chapeusDePalha.add("Zorro");
        chapeusDePalha.add("Nami");

        //System.out.println(chapeusDePalha.stream().count());

        Stream<String> bandoDoBarbaNegra = chapeusDePalha.stream();

        Stream<String> resultado = bandoDoBarbaNegra.filter(nome -> nome.equals("Luffy"));

        System.out.println(resultado.toList());

        Pessoa theo = new Pessoa("Theo", "Trindade");
        Pessoa joao = new Pessoa("Joao", "Silva");
        Pessoa jessica = new Pessoa("Jessica", "Oliveira");

        List<Pessoa> usuarios = new ArrayList<Pessoa>();
        usuarios.add(theo);
        usuarios.add(joao);
        usuarios.add(jessica);

        Stream<Pessoa> usuariosStream = usuarios.stream();

        Stream<String> resultadoMap = usuariosStream.map(usuario -> {
            return usuario.getNome() + usuario.getSobrenome();
        });

        System.out.println(resultadoMap.toList());



    }
}
