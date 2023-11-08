package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogDePedido implements AcaoAposGerarPedido {
    
    @Override
    public void executarAcao(Pedido pedido) {
        log.info("Pedido gerado: {}", pedido);
    }

}
