package strategy.loja.situacao;

import strategy.StateException;
import strategy.loja.Pedido;

public abstract class Situacao {

    public void pagar(Pedido pedido){
        throw new StateException("Não pode transitar para pago");
    }

    public void entregar(Pedido pedido){
        throw new StateException("Não pode transitar para pago");
    }

    public void cancelar(Pedido pedido){
        throw new StateException("Não pode transitar para pago");
    }

    public void reabrir(Pedido pedido){
        throw new StateException("Não pode transitar para pago");
    }

    public abstract void abrirChamado();
}
