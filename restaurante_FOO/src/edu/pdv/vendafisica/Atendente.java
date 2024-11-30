package edu.pdv.vendafisica;

public class Atendente {
    private Long id;
    private String nome;

    // Construtor
    public Atendente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Metodos principais
    public void registrarPedido(Pedido pedido) {
        if (pedido != null) {
            System.out.println("Pedido registrado pelo atendente: " + nome);
        } else {
            System.out.println("O pedido é invalido.");
        }
    }
    // Simula processos de alteração de pedido
    public void alterarPedido(Pedido pedido) {
        if (pedido != null && pedido.getIsAberto()) {
            System.out.println("Pedido " + pedido.getId() + " alterado pelo atendente: " + nome);
        } else if (pedido != null) {
            System.out.println("O pedido já foi fechado e não pode ser alterado.");
        } else {
            System.out.println("O pedido é invalido.");
        }
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
