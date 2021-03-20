package strategy.loja.imposto;

import strategy.loja.Pedido;

import java.math.BigDecimal;

public class IPI implements Imposto{


    @Override
    public BigDecimal calcular(Pedido pedido) {
        return pedido.getValor().multiply(BigDecimal.valueOf(.05));
    }
}
