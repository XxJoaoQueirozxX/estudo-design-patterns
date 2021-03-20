package observer;

import strategy.loja.Pedido;
import strategy.loja.situacao.Situacao;

import java.util.ArrayList;
import java.util.List;

public class PedidoHandler {
    private List<Listener> listeners;

    public PedidoHandler(){
        this.listeners = new ArrayList<>();
    }


    public void subscribe(Listener listener){
        listeners.add(listener);
    }

    public void unsubscribe(Listener listener){
        listeners.remove(listener);
    }

    public void notify(Pedido pedido){
        listeners.forEach(l -> l.update(pedido));
    }
}
