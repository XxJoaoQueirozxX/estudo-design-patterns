package br.com.fiap.application.domain.loja.situacao.estados;

import br.com.fiap.application.domain.loja.situacao.Situacao;

public class Entregue extends Situacao {
    @Override
    public void abrirChamado() {
        System.out.println("Abrir para o pos venda");
    }
}
