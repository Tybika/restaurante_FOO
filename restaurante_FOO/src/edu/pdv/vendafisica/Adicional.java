package edu.pdv.vendafisica;

public class Adicional {
    private long id;
    private String nome;
    private double preco;
    private int quantidade;
    private double desconto;

    //Contrutor, não passei o ID pois ele é autogerado (eu acho)
    public Adicional(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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
