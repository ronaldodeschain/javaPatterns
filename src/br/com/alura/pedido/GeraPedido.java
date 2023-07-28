package br.com.alura.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
		super();
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}
	
	public void executa() {
		Orcamento orcamento = new Orcamento(this.valorOrcamento,this.quantidadeItens);
		Pedido pedido = new Pedido(cliente,LocalDateTime.now(), orcamento);
		
		System.out.println("salvar pedido");
		System.out.println("email com dados do novo pedido");
	}
}
