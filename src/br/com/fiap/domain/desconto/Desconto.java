package br.com.fiap.domain.desconto;

import br.com.fiap.domain.loja.Pedido;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public final BigDecimal calcular(Pedido pedido){
        if (deveAplicar(pedido)){
            return aplicar(pedido);
        }else{
            return proximo.calcular(pedido);
        }
    }

    protected abstract BigDecimal aplicar(Pedido pedido);

    protected abstract boolean deveAplicar(Pedido pedido);

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

}
