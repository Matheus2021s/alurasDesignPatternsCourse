package br.com.mariah.loja.imposto;

import java.math.BigDecimal;

import br.com.mariah.loja.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento) ;

}
