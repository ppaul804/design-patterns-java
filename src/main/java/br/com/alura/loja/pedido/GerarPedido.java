package br.com.alura.loja.pedido;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class GerarPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;
}
