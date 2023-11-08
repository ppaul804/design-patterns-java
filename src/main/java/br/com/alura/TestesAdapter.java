package br.com.alura;

import br.com.alura.loja.orcamento.*;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();
        new RegistroDeOrcamento(new JavaHttpClient()).registrar(orcamento);
    }
}
