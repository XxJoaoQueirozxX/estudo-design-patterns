package chain_of_reponsability.desconto.desconto;

import chain_of_reponsability.desconto.desconto.Desconto;
import strategy.loja.Pedido;

import java.math.BigDecimal;

public class DescontoPorValor extends Desconto {

    public DescontoPorValor(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Pedido pedido) {
        if (pedido.getValor().compareTo(BigDecimal.valueOf(500)) > 0) {
            return pedido.getValor().multiply(BigDecimal.valueOf(.1));
        }else{
            return proximo.calcular(pedido);
        }
    }
}
