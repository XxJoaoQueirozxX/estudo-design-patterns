package observer;

import strategy.loja.Pedido;

public interface Listener {
    void update(Pedido pedido);
}
