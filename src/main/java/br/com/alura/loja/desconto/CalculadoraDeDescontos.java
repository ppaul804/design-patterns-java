package br.com.alura.loja.desconto;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        // O desconto considera as regras (classes) passada pelos construtores pela
        // ordem de execução das classes
        Desconto desconto = new DescontoQtdItem(new DescontoValorItem(new SemDesconto()));
        return desconto.calcular(orcamento);
    }

}
