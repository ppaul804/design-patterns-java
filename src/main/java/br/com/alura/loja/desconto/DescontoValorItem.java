package br.com.alura.loja.desconto;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public class DescontoValorItem extends Desconto {

    public DescontoValorItem(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0)
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        return proximo.calcular(orcamento);
    }

}
