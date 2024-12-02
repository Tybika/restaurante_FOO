package edu.pdv.vendafisica;

import java.util.*;

public class Pedido {
    private long id;
    private String mesa;
    private Date data;
    private Date horaAbertura;
    private Date horaFechamento;
    private boolean isAberto;
    private Atendente atendente;
    private List<ItemPedido> itens;
    private int[] quantidade;

    // Construtores
    public Pedido(String mesa, Atendente atendente,
                  List<ItemPedido> itens, int quantidade){
        Calendar calendar = Calendar.getInstance();

        this.mesa = mesa;
        this.data = calendar.date(); // conferir met
        this.horaAbertura = calendar.getTime();
        this.horaFechamento = 0;
        this.isAberto = true;
        this.atendente = atendente;
        this.itens = new List<ItemPedido>;
        this.quantidade[buscarUltimo()] = quantidade;
    }

    public int buscarUltimo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return i;
            }
        }
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getMesa() {
        return mesa;
    }

    public Date getData() {
        return data;
    }

    public Date getHoraAbertura() {
        return horaAbertura;
    }

    public Date getHoraFechamento() {
        return horaFechamento;
    }

    public boolean getIsAberto() {
        return isAberto;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public List<ItemPedido> getItens() {
        return List<ItemPedido>;
    }

    public int[] getQuantidade() {
        return quantidade;
    }

    // Setters
    public void setIsAberto(boolean estado){
        this.isAberto = estado;
        if (estado == false) {
            Calendar aleatorio = Calendar.getInstance();
            setHoraFechamento(calendar.getTime());
        }
    }

    public void setHoraFechamento(Date hora){
        this.horaFechamento = hora;
    }

}
