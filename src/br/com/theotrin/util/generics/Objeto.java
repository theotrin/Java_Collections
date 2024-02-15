package br.com.theotrin.util.generics;

public class Objeto <O> {
    private O nome;

    public Objeto(O nome) {
        this.nome = nome;
    }

    public O getNome() {
        return nome;
    }

    public void setNome(O nome) {
        this.nome = nome;
    }
}
