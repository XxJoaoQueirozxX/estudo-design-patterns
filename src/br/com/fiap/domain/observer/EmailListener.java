package br.com.fiap.domain.observer;

import br.com.fiap.domain.loja.Pedido;

public class EmailListener implements Listener{

    @Override
    public void update(Pedido pedido) {
        System.out.println("Enviando email...");
    }
}
