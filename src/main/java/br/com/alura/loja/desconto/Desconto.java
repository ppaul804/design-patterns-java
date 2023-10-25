package br.com.alura.loja.desconto;

import br.com.alura.loja.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Desconto {
    /*
     * Escolhendo entre uma Classe Abstrata e uma Interface:
     * Se você precisa fornecer uma implementação padrão de alguns métodos e deseja
     * deixar outros métodos para serem implementados pelas subclasses,
     * use uma classe abstrata.
     * Se você quer apenas definir um contrato (ou seja, quais métodos uma classe
     * deve implementar) sem se preocupar com a implementação, use uma interface.
     */

    protected Desconto proximo;

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento))
            return efetuarCalculo(orcamento);
        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    protected abstract boolean deveAplicar(Orcamento orcamento);
}