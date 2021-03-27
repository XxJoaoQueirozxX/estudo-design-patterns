package br.com.fiap.domain.loja.situacao.estados;

import br.com.fiap.domain.loja.situacao.Situacao;

public class Entregue extends Situacao {
    @Override
    public void abrirChamado() {
        System.out.println("Abrir para o pos venda");
    }
}
