package br.com.fiap.domain.loja.situacao.estados;

import br.com.fiap.domain.loja.Pedido;
import br.com.fiap.domain.loja.situacao.Situacao;

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
