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
    public ItemPedido(String nome, String categoria, double preco, double desconto,
                      ArrayList<adicionais>, boolean isDisponivel) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.desconto = desconto;
        this.adicionais = new ArrayList<Adicional>(); // Eu não tenho ideia de como usar isso
        this.isDisponivel = isDisponivel;
    }

    // Métodos que fazem algo
    public long listItens(){ // Deveria printar cada item dentro da lista, pelo o que li, são long...
        for (long i : adicionais){
            System.out.println(i); // Deve printar ou retornar?
        }
    }
    public long listItensDisponiveis(){
        for (long i : adicionais){
            if (isDisponivel){ // Não sei exatamente como verificar se um item em específico está disponível,
                System.out.println(i);// então ficou assim por enquanto: se isDisponivel é true, então printa
                                // (já que ele é boolean tem como deixar desse jeito engraçado)
            }
        }
    }
    public String encontrarIDPorNome(String nome){
        // Teria que ter uma arraylist de todos os itens para fazer isso?
        // Realmente não sei como isso funcionaria
    }

    // Getters
    public long getId(){ return id; }
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
