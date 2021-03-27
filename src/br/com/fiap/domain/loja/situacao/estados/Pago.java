package br.com.fiap.domain.loja.situacao.estados;

import br.com.fiap.domain.loja.Pedido;
import br.com.fiap.domain.loja.situacao.Situacao;

public class Pago extends Situacao {

    @Override
    public void abrirChamado() {
        System.out.println("Abrir para a logistica");
    }

    @Override
    public void entregar(Pedido pedido) {
        pedido.setSituacao(new Entregue());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setSituacao(new Cancelado());
    }
}
