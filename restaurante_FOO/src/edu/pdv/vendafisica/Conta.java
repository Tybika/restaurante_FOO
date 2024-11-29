package edu.pdv.vendafisica;

public class Conta {
    private Pedido pedido;
    private float valorTotal;
    private float totalDesconto;
    private float valorRestante;

    public Conta(Pedido pedido){
        this.pedido = pedido;
        this.valorTotal = conta.calcularValorTotal();
        this.totalDesconto = calcularDescontoPercentual() +
                             calcularDescontoNominal() + calcularDescontoProgressivo();
        this.valorRestante = valorTotal - totalDesconto;
    }


    private calcularValorTotal(){

    }
}