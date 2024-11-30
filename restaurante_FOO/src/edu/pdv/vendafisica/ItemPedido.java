package edu.pdv.vendafisica;
import java.util.*;

public class ItemPedido {
    private long id;
    private String nome;
    private String categoria;
    private double preco;
    private double desconto;
    private ArrayList<Adicional> adicionais;
    private boolean isDisponivel;

    // Contrutor
    public ItemPedido(String nome, String categoria, double preco, double desconto) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.desconto = desconto;
        this.adicionais = new ArrayList<adicionais>(); // Eu não tenho ideia de como usar isso
        this.isDisponivel = isDisponivel;
    }

    // Métodos que fazem algo
    public long listItens(){ // Deveria printar cada item dentro da lista, pelo o que li, são long...
        for (long i : adicionais){
            System.out.println(i);
        }
    }
    public String encontrarIDPorNome(String nome){
        // Não sei como sequer iniciar isso
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
