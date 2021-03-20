package strategy.loja.situacao.estados;

import strategy.loja.Pedido;
import strategy.loja.situacao.Situacao;

public class Cancelado extends Situacao {
    @Override
    public void abrirChamado() {
        System.out.println("Abrir para o comercial");
    }

    @Override
    public void reabrir(Pedido pedido) {
        pedido.setSituacao(new Aberto());
    }
}
