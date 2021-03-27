package br.com.fiap.domain.observer;

import br.com.fiap.domain.loja.Pedido;

public class LogListener implements Listener {
    @Override
    public void update(Pedido pedido) {
        System.out.println("Gravando log do pedido .....");
    }
}
