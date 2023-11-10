package br.com.alura.orcamento;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.Orcavel;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
public class OrcamentoProxy implements Orcavel {
    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if (orcamento == null) {
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }

}
