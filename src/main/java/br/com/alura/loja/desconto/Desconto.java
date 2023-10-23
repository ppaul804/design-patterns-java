package br.com.alura.loja.desconto;

import br.com.alura.loja.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Desconto {

    protected Desconto proximo;

    abstract BigDecimal calcular(Orcamento orcamento);
}