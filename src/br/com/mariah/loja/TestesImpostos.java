package br.com.mariah.loja;

import java.math.BigDecimal;

import br.com.mariah.loja.imposto.CalculadoraDeImpostos;
import br.com.mariah.loja.imposto.ICMS;
import br.com.mariah.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS() ));
	}

}
