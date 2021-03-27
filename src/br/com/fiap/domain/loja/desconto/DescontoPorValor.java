package br.com.fiap.domain.loja.desconto;

import br.com.fiap.domain.loja.Pedido;

import java.math.BigDecimal;

public class DescontoPorValor extends Desconto {

    public DescontoPorValor(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal aplicar(Pedido pedido) {
        return pedido.getValor().multiply(BigDecimal.valueOf(.1));
    }

    @Override
    protected boolean deveAplicar(Pedido pedido) {
        return pedido.getValor().compareTo(BigDecimal.valueOf(500)) > 0;
    }
}
