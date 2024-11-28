package edu.pdv.vendafisica;

public class Pedido {
    private long id;
    private String mesa;
    private Date data;
    private Date horaAbertura;
    private Date horaFechamento;
    private boolean isAberto;
    private Atendente atendente;
    private List<ItemPedido> items;
    private int quantidade[]; //precisa repensar o tipo desse atributo

    public Pedido(String mesa, Atendente atendente) {

    }
}
