package br.com.fiap.application.domain.observer;

import br.com.fiap.application.domain.loja.Pedido;

public interface Listener {
    void update(Pedido pedido);
}
