package br.com.fiap.domain.observer;

import br.com.fiap.domain.loja.Pedido;

public interface Listener {
    void update(Pedido pedido);
}
