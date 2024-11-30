package edu.pdv.vendafisica;

import java.util.*

public class Pedido {
    private long id;
    private String mesa;
    private Calendar data;
    private Calendar horaAbertura;
    private Calendar horaFechamento;
    private boolean isAberto;
    private Atendente atendente;
    private List<ItemPedido> items;
    private int[] quantidade; //precisa repensar o tipo desse atributo

    public Pedido(String mesa, Atendente atendente) {

    }
    private List<ItemPedido> itens;
    private int[] quantidade;

    // Construtor
    // Não boto nem 1% de confiança no que eu escrevi...
    public Pedido(String mesa, Date data, Date horaAbertura, Date horaFechamento,
                  boolean isAberto, Atendente atendente, List<ItemPedido> itens, int[] quantidade){
        this.mesa = mesa;
        this.data = data;
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.isAberto = isAberto;
        this.atendente = atendente;
        this.itens = new List<itens>;
        this.quantidade = quantidade;
    }

    // Métodos normais


    // Getters
    public long getId() { return id; }
    public String getMesa() { return mesa; }
    public Date getData() { return data; }
    public Date getHoraAbertura() { return horaAbertura; }
    public Date getHoraFechamento() { return horaFechamento; }
    public boolean getIsAberto() { return isAberto; }
    public Atendente getAtendente() { return atendente; }
    public List<ItemPedido> getItens() { return itens; }
    public int[] getQuantidade() { return quantidade; }

    // Setters
    public void setIsAberto(){ this.isAberto = isAberto; }
    public void setHoraFechamento(){ this.horaFechamento = horaFechamento; }

}
