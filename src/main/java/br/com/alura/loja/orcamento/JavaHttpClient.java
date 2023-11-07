package br.com.alura.loja.orcamento;

import br.com.alura.loja.http.HttpAdapter;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            URLConnection conn = urlDaApi.openConnection();
            conn.connect();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao realizar chamada HTTP");
        }
    }

}
