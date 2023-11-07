package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class RegistroDeOrcamento {
    @NonNull
    private HttpAdapter http;

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orcamento ja foi finalizado");
        }
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of("valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens());
        http.post(url, dados);
    }
}