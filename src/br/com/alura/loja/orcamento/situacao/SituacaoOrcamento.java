package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento já foi aprovado");
	}	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento já foi reprovado");
	}
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("já foi finalizado");
	}
}
