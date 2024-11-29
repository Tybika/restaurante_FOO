package edu.pdv.vendafisica;

import java.util.Date;

public class Pagamento {
    private Long id;
    private Pedido pedido;
    private Double valor;
    private String formaPagamento;
    private Date hora;
    private Cliente pagante;

    // Construtor
    public Pagamento(Long id, Pedido pedido, Double valor, String formaPagamento, Date hora, Cliente pagante) {
        this.id = id;
        this.pedido = pedido;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.hora = hora;
        this.pagante = pagante;
    }

    // Métodos principais
    public void gerarNF() {
        System.out.println("Nota Fiscal:");
        System.out.println("ID do Pagamento: " + id);
        System.out.println("Cliente: " + pagante.getNome());
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Valor: " + valor);
        System.out.println("Hora: " + hora);
    }

    // Getters
    public Long getId() { return id; }
    public Pedido getPedido() { return pedido; }
    public Double getValor() { return valor; }
    public String getFormaPagamento() { return formaPagamento; }
    public Date getHora() { return hora; }
}