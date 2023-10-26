package br.com.alura;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 2);
		Orcamento terceiro = new Orcamento(new BigDecimal("500"), 1);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		logger.info("{}", calculadora.calcular(primeiro));
		logger.info("{}", calculadora.calcular(segundo));
		logger.info("{}", calculadora.calcular(terceiro));
    }

}
