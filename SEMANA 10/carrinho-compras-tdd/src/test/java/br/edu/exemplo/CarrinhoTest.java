package br.edu.exemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarrinhoTest {

    @Test
    void deveCriarCarrinhoVazio(){
     Carrinho carrinho = new Carrinho();

     assertEquals(0, carrinho.getValor());
    }

    @Test
    void deveAdicionarUmProdutoNoCarrinho(){
        Carrinho carrinho = new Carrinho();
        Produto teclado = new Produto("Teclado", 100);

        carrinho.adicionarProduto(teclado);
        assertEquals(100, carrinho.getValor());
    }

    @Test
    void deveAdicionarVariosProdutos(){
        Carrinho carrinho = new Carrinho();
        Produto teclado = new Produto("Teclado", 100);
        Produto mouse = new Produto("Mouse", 50);

        carrinho.adicionarProduto(teclado);
        carrinho.adicionarProduto(mouse);

        assertEquals(150, carrinho.getValor());
    }

    @Test
    void deveRemoverProduto(){
        Carrinho carrinho = new Carrinho();
        Produto teclado = new Produto("Teclado", 100);
        Produto mouse = new Produto("Mouse", 50);

        carrinho.adicionarProduto(teclado);
        carrinho.adicionarProduto(mouse);

        carrinho.removerProduto(mouse);

        assertEquals(100, carrinho.getValor());
    }

    @Test
    void deveChecarProPrecoInvalido(){
        Carrinho carrinho = new Carrinho();
        Produto teclado = new Produto("Teclado", -100);

        carrinho.adicionarProduto(teclado);

        assertEquals(0, carrinho.getValor());
    }

    @Test
    void deveAplicarDescontoParaComprasDe500ReaisOuMais(){
        Carrinho carrinho = new Carrinho();
        Produto teclado = new Produto("Teclado", 100);
        Produto monitor = new Produto("Monitor", 400);

        carrinho.adicionarProduto(teclado);
        carrinho.adicionarProduto(monitor);

        carrinho.aplicarDesconto();

        assertEquals(450, carrinho.getValor());
    }
}
