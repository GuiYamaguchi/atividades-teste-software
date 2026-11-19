package br.edu.exemplo;

public class Carrinho {

    Produto produto;
    double valor;

    public Carrinho() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void adicionarProduto(Produto produto){
        if (produto.getPreco() < 0) {
            this.valor += 0;
            return;
        }
        this.valor += produto.getPreco();
    }

    public void removerProduto(Produto produto){
        this.valor -= produto.getPreco();
    }

    public void aplicarDesconto(){
        if (this.valor >= 500){
            this.valor = 0.90 * this.valor;
        }
    }
}
