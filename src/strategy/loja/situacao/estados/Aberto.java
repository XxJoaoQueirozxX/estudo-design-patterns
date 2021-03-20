package strategy.loja.situacao.estados;

import strategy.loja.Pedido;
import strategy.loja.situacao.Situacao;

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
