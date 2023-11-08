package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.GerarPedido;
import br.com.alura.loja.pedido.GerarPedidoHandler;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Ana da Silva";
        BigDecimal valorOrcamento = BigDecimal.valueOf(745.99);
        int quantidadeItens = 3;

        GerarPedido gerarPedido = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler(Arrays.asList(
                new EnviarEmailPedido(),
                new SalvarPedidoNoBancoDeDados(),
                new LogDePedido()));
        // Facade
        gerarPedidoHandler.executar(gerarPedido);
    }
}
