package br.com.alura.pedido.acao;

import br.com.alura.pedido.Pedido;

public class SalvarPedidoNoBanco implements AcaoAposGerarPedido{

	public void executarAcao(Pedido pedido) {
		System.out.println("salvar pedido no banco de dados");
	}
}
