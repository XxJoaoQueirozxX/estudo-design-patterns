package br.com.fiap.application.domain.observer;

import br.com.fiap.application.domain.loja.Pedido;

public class EmailListener implements Listener{

    @Override
    public void update(Pedido pedido) {
        System.out.println("Enviando email...");
    }
}
