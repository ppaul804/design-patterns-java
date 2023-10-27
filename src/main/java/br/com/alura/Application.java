package br.com.alura;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GerarPedido;
import br.com.alura.loja.pedido.GerarPedidoHandler;
import br.com.alura.loja.pedido.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 2);
		Orcamento terceiro = new Orcamento(new BigDecimal("500"), 1);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		log.info("{}", calculadora.calcular(primeiro));
		log.info("{}", calculadora.calcular(segundo));
		log.info("{}", calculadora.calcular(terceiro));

        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GerarPedido gerarPedido = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(/* dependencias */);
        handler.executar(gerarPedido);
    }

}
