package br.com.mariah.loja.desconto;

import java.math.BigDecimal;

import br.com.mariah.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {
	
	public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0 ) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));

		}
		return proximo.calcular(orcamento);
	}
}
