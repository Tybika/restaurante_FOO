package edu.pdv.vendafisica;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Conta {
    private Pedido pedido;
    private float valorTotal;
    private float totalDesconto;
    private float valorRestante;

    // Construtor da classe
    public Conta(Pedido pedido){
        this.pedido = pedido;
        this.valorTotal = this.calcularValorTotal();
        this.totalDesconto = this.calcularDescontoPercentual() +
                             this.calcularDescontoNominal() + this.calcularDescontoProgressivo();
        this.valorRestante = valorTotal - totalDesconto;
    }

    // Calcula valor total
    private double calcularValorTotal(){
        List<ItemPedido> itens = this.pedido.getItems();
        int[] quantidade = this.pedido.getQuantidade();
        double valorTotal = 0;

        for (int i = 0; i < itens.size(); i++){
            valorTotal += itens.get(i).getPreco() * quantidade[i];
            valorTotal = valorTotal - itens.get(i).getDesconto() * quantidade[i];
        }

        return valorTotal;
    }

    // Calcula descontos percentuais
    public double calcularDescontoPercentual(double n){
        if (n <= 0 || n > 100){
            return 0;
        }

        if (n > 1){
            n = n / 100;
        }

        double desconto = n * valorTotal;
        return desconto;
    }

    // Calcula descontos nominais
    public double calcularDescontoNominal(double desconto){
        if (n <= 0 || n > valorTotal){
            return 0;
        }

        return desconto;
    }

    // Calcula desconto progressivo
    public double calcularDescontoProgressivo(long itemId, double descontoMin,
                                              double descontoMax, double progressao, int qntMin){
        // Verifica validade dos parâmetros
        if (descontoMax > descontoMin && descontoMax <= 100 && descontoMin > 0 &&
                progressao > 0 && progressao <= descontoMax && qntMin > 0){
            double preco;
            int n;


            List<ItemPedido> itens = this.pedido.getItems;
            int[] quantidade = this.pedido.getQuantidade;
            int qnt = 0;

            // Itera itens buscando itemId
            for (int i = 0; i < itens.size(); i++){
                n = itens.get(i).getId();
                if(n == itemId){
                    preco = itens.get(i).getPreco();
                    qnt = quantidade[i];
                    break;
                }
            }

            // Verifica quantidade de itens
            if (qnt > qntMin){
                int dif, intervalos, qntMax;
                double desconto = 0;

                // Aumenta a progressão para cada número de diferença entre qnt e min
                for(int i = qntMin; i < qnt; i++){
                    if ((desconto + progressao) <= descontoMax ){
                        desconto += progressao;
                    }
                    else{
                        break;
                    }
                }

                if (desconto > 1){
                    desconto = desconto / 100;
                }

                desconto = (desconto * preco) * qnt;
                return desconto;
            }
        }
        return 0;
    }

    // Calcula o valor da divisão em partes iguais
    public double dividirIgual(int divisor){
        double parcela;

        parcela = valorRestante / divisor;
        return parcela;
    }

    // Calcula o valor de itens da conta
    public double dividirItem(long itemId, int quantidade) {
        if (quantidade <= 0){
            return 0;
        }

        double parcela;
        int n;
        List<ItemPedido> itens = this.pedido.getItens();
        int[] quantidade = this.pedido.getQuantidade();
        int qnt = 0;

        for (int i = 0; i < itens.size(); i++){
            n = itens.get(i).getId();
            if (n == itemId) {
                preco = itens.get(i).getPreco();
                qnt = quantidade[i];
                break;
            }
        }

        if (qnt <= quantidade){
            parcela = preco * quantidade;
            return parcela;
        } else {
            return 0;
        }

    }

    // Deduz do valorRestante
    public void pagar(double valor){
        if (valor <= 0 || valor > this.valorRestante){
            return;
        }

        pagamento = new Pagamento(valor);
        this.setValorRestante((this.valorRestante - valor));
        return;
    }

    // Getters
    public Pedido getPedido() {
        return pedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getTotalDesconto() {
        return totalDesconto;
    }

    public double getValorRestante() {
        return valorRestante;
    }

    // Setters
    public void setValorRestante(double valor) {
        this.valorRestante = valor;
    }

}