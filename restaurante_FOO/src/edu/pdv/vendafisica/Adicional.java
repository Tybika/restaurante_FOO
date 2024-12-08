package edu.pdv.vendafisica;

public class Adicional {
    private long id;
    private String nome;
    private double preco;
    private int quantidade;
    private double desconto;

    //Contrutor
    public Adicional(String nome, double preco, int quantidade, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }
    // Getters
    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    // Setters
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
