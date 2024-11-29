package edu.pdv.vendafisica;

public class Conta {
    private Pedido pedido;
    private float valorTotal;
    private float totalDesconto;
    private float valorRestante;

    public Conta(Pedido pedido){
        this.pedido = pedido;
        this.valorTotal = this.calcularValorTotal();
        this.totalDesconto = this.calcularDescontoPercentual() +
                             this.calcularDescontoNominal() + this.calcularDescontoProgressivo();
        this.valorRestante = valorTotal - totalDesconto;
    }

    private double calcularValorTotal(){
        List<ItemPedido> itens = this.pedido.getItems();
        int[] quantidade = this.pedido.getQuantidade();
        double valorTotal = 0;

        for (int i = 0; i < itens.size(); i++){
            valorTotal += itens.get(i).getPreco() * quantidade[i];
        }

        return valorTotal;
    }

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

    public double calcularDescontoNominal(double n){
        if (n <= 0 || n > valorTotal){
            return 0;
        }

        return n;
    }

    public double calcularDescontoProgressivo(double descontoMin, double descontoMax
                                              double progressao, int qntMin, long item){
        if (descontoMax > descontoMin && descontoMax <= 100 && descontoMin > 0 &&
                progressao > 0 && progressao <= descontoMax && qntMin > 0){
            int intervalos = (int) descontoMax / progressao;
            int qntMax = qntMin + intervalos;
            List<ItemPedido> items = this.pedido.getItems;
            int[] quantidade = this.pedido.getQuantidade;

            if (n > qntMin){

            }
        }
        return 0;

    }
}