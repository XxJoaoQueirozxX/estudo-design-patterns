package observer;

import strategy.loja.Pedido;

public class LogListener implements Listener {
    @Override
    public void update(Pedido pedido) {
        System.out.println("Gravando log do pedido .....");
    }
}
