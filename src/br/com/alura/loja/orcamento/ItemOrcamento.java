package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel {

	public BigDecimal valor;
	
	public ItemOrcamento(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getValor() {
		return valor;
	}
}
