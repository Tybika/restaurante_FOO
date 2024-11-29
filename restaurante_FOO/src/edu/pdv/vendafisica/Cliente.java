package edu.pdv.vendafisica;

public class Cliente {
    private String nome;
    private String cpf;

    // Construtores
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters
    public String getNome() { return nome; }
    public String getCPF() { return cpf; }
}
