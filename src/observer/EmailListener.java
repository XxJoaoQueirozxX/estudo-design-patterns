package observer;

import strategy.loja.Pedido;

public class EmailListener implements Listener{

    @Override
    public void update(Pedido pedido) {
        System.out.println("Enviando email...");
    }
}
