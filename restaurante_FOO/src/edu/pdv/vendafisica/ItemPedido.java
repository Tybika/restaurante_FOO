package edu.pdv.vendafisica;

public class ItemPedido {
    private long id;
    private String nome;
    private String categoria;
    private double preco;
    private double desconto;
    private List<Adicional> adicionais;
    private boolean isDisponivel;

    // Contrutor
    public ItemPedido(String nome, String categoria, double preco, double desconto) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.desconto = desconto;
        this.adicionais = adicionais; // É assim que eu faço no contrutor no caso da lista? Já verifico
        this.isDisponivel = isDisponivel;
    }

    // Métodos que fazem algo
    // Método com Lista que farei depois do primeiro commit
    // Segundo método com Lista que farei depois do primeiro commit
    public String encontrarIDPorNome(String nome){
        // Não tenho ideia de como programar isso KKKKKKKKKK
    }

    // Getters
    public long getId(){ return id; }
    // COLOCO O NOME DO GET DIFERENTE PORQUE TODOS TERIAM O MESMO NOME DE getId?
    // Isso acontece com outros métodos também ^^
    public String getNome(){ return nome; }
    public String getCategoria(){ return categoria; }
    public double getPreco(){ return preco; }
    public double getDesconto(){ return desconto; }
    public boolean getIsDisponivel(){ return isDisponivel; }

    // Setters
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public void setIsDisponivel(boolean isDisponivel) {
        this.isDisponivel = isDisponivel;
    }
}
