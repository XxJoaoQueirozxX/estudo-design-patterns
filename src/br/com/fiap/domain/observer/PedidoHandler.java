package br.com.fiap.domain.observer;

import br.com.fiap.domain.loja.Pedido;

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
