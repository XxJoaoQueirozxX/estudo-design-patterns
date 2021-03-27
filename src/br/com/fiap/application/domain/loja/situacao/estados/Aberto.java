package br.com.fiap.application.domain.loja.situacao.estados;

import br.com.fiap.application.domain.loja.Pedido;
import br.com.fiap.application.domain.loja.situacao.Situacao;

public class Aberto extends Situacao {
    @Override
    public void abrirChamado() {
        System.out.println("Chamado aberto para financeiro");
    }

    @Override
    public void pagar(Pedido pedido) {
        pedido.setSituacao(new Pago());
    }

    @Override
    public void cancelar(Pedido pedido){
        pedido.setSituacao(new Cancelado());
    }
}
