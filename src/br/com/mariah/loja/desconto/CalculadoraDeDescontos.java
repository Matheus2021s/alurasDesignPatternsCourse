package br.com.mariah.loja.desconto;

import java.math.BigDecimal;

import br.com.mariah.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = 
				new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
				new SemDesconto()));

		return desconto.calcular(orcamento);
	}
}
