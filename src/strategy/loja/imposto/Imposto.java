package strategy.loja.imposto;

import strategy.loja.Pedido;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calcular(Pedido pedido);
}
