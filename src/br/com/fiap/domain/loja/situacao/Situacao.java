package br.com.fiap.domain.loja.situacao;

import br.com.fiap.domain.StateException;
import br.com.fiap.domain.loja.Pedido;

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
