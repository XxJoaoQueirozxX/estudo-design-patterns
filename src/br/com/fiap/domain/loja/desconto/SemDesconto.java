package br.com.fiap.domain.loja.desconto;

import br.com.fiap.domain.loja.Pedido;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{
    public SemDesconto() {
        super(null);
    }


    @Override
    protected BigDecimal aplicar(Pedido pedido) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean deveAplicar(Pedido pedido) {
        return true;
    }
}
