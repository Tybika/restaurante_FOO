package edu.pdv.vendafisica;

import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

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
}
