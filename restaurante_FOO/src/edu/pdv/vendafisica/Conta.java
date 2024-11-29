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
        //Tem que inserir o desconto que venha de itens aqui tbm (ou fazê-lo em valorTotal)
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

    public double calcularDescontoNominal(double desconto){
        if (n <= 0 || n > valorTotal){
            return 0;
        }

        return desconto;
    }

    public double calcularDescontoProgressivo(long itemId, double descontoMin,
                                              double descontoMax, double progressao, int qntMin){
        //Verifica validade dos parâmetros
        if (descontoMax > descontoMin && descontoMax <= 100 && descontoMin > 0 &&
                progressao > 0 && progressao <= descontoMax && qntMin > 0){
            double preco;
            int n;


            List<ItemPedido> itens = this.pedido.getItems;
            int[] quantidade = this.pedido.getQuantidade;
            int qnt = 0;

            //Itera itens buscando itemId
            for (int i = 0; i < itens.size(); i++){
                n = itens.get(i).getId;
                if (n == itemId){
                    preco = itens.get(i).getPreco;
                    qnt = quantidade[i];
                    break;
                }
            }

            //Calcula se
            if (qnt > qntMin){
                int dif, intervalos, qntMax;
                double desconto;

                for (int i = qntMin; i < qnt; i++){
                    if (i < qntMax){

                    }
                }

                dif = qnt - qntMin;
                intervalos = (int) descontoMax / progressao;
                qntMax = qntMin + intervalos;

                desconto = (preco* ) * qnt;
                return desconto;
            }
        }
        return 0;

    }
}