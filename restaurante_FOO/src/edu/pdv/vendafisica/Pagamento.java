package edu.pdv.vendafisica;

// Biblioteca de date
import java.util.Date;
import java.util.Calendar;

public class Pagamento {
<<<<<<< Updated upstream
    private long id;
    private Pedido pedido;
    private double valor;
    private String formaPagamento;
=======
    private static long ultimoId = 1;

    private long id;
    private Pedido pedido = null;
    private double valor;
    private String formaPagamento = null;
>>>>>>> Stashed changes
    private Date hora;
    private Cliente pagante = null;

    // Construtores
    public Pagamento(long id, Pedido pedido, double valor, String formaPagamento, Date hora, Cliente pagante) {
        this.id = id;
        this.pedido = pedido;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.hora = hora;
        this.pagante = pagante;
    }

    public Pagamento(double valor) {
        this.id = Pagamento.ultimoId++;
        this.valor = valor;
        this.hora = Calendar.getInstance().getTime();
    }

    // Metodo de gerar nota fiscal:
    public void gerarNF() {
        System.out.println("Nota Fiscal:");
        System.out.println("ID do Pagamento: " + id);
        System.out.println("Hora: " + hora);
        System.out.println("Valor: " + valor);

        if (pagante != null) {
            System.out.println("Cliente: " + pagante.getNome());
        }

        if (formaPagamento != null) {
            System.out.println("Forma de Pagamento: " + formaPagamento);
        }
    }

<<<<<<< Updated upstream
    // Getters (não sei se esse jeito de indentar os returns vai dar certo)
    public long getId() { return id; }
    public Pedido getPedido() { return pedido; }
    public double getValor() { return valor; }
    public String getFormaPagamento() { return formaPagamento; }
    public Date getHora() { return hora; }
=======
    // Getters
    public long getId() {
        return id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public double getValor() {
        return valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public Date getHora() {
        return hora;
    }
>>>>>>> Stashed changes
}