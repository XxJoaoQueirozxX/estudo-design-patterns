package chain_of_reponsability.desconto.desconto;

import chain_of_reponsability.desconto.desconto.Desconto;
import strategy.loja.Pedido;

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
