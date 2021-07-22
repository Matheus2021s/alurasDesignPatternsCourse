package br.com.mariah.loja.imposto;

import java.math.BigDecimal;

import br.com.mariah.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
