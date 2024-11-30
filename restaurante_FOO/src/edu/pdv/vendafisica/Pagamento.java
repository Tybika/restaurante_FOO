package edu.pdv.vendafisica;

// Biblioteca de date
import java.util.Date;

public class Pagamento {
    private long id;
    private Pedido pedido;
    private double valor;
    private String formaPagamento;
    private Date hora;
    private Cliente pagante;

    // Construtores
    public Pagamento(long id, Pedido pedido, double valor, String formaPagamento, Date hora, Cliente pagante) {
        this.id = id;
        this.pedido = pedido;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.hora = hora;
        this.pagante = pagante;
    }

    // Metodo de gerar nota fiscal:
    public void gerarNF() {
        System.out.println("Nota Fiscal:");
        System.out.println("ID do Pagamento: " + id);
        System.out.println("Cliente: " + pagante.getNome());
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Valor: " + valor);
        System.out.println("Hora: " + hora);
    }

    // Getters (não sei se esse jeito de indentar os returns vai dar certo)
    public long getId() { return id; }
    public Pedido getPedido() { return pedido; }
    public double getValor() { return valor; }
    public String getFormaPagamento() { return formaPagamento; }
    public Date getHora() { return hora; }
}