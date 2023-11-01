package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
    public void executarAcao(Pedido pedido) {
        log.info("Salvar pedido no banco de dados");
    }

}
