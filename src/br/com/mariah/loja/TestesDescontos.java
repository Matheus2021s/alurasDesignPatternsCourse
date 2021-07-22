package br.com.mariah.loja;

import java.math.BigDecimal;

import br.com.mariah.loja.desconto.CalculadoraDeDescontos;
import br.com.mariah.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"),6);
		Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"),1);

		CalculadoraDeDescontos calculadoraDeImpostos = new CalculadoraDeDescontos();
		System.out.println(calculadoraDeImpostos.calcular( primeiroOrcamento ));
		System.out.println(calculadoraDeImpostos.calcular( segundoOrcamento ));

	}

}
