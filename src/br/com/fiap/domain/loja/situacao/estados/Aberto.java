package br.com.fiap.domain.loja.situacao.estados;

import br.com.fiap.domain.loja.Pedido;
import br.com.fiap.domain.loja.situacao.ChamadoFacade;
import br.com.fiap.domain.loja.situacao.Situacao;

public class Aberto extends Situacao {
    @Override
    public void abrirChamado() {
        new ChamadoFacade().abrir(null);
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
