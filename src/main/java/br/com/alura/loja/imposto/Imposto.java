package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Imposto {
    private Imposto proximo;

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoProximoImposto = BigDecimal.ZERO;
        if (proximo != null)
            valorDoProximoImposto = proximo.realizarCalculo(orcamento);
        return valorImposto.add(valorDoProximoImposto);
    }

}
