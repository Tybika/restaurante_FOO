package edu.pdv.vendafisica;

public class ItemPedido {
    private long id;
    private String nome;
    private String categoria;
    private double preco;
    private double desconto;
    private List<AdicionalItemPedido> adicionais;

    public ItemPedido(String nome, String categoria, double preco, double desconto) {

    }
}
