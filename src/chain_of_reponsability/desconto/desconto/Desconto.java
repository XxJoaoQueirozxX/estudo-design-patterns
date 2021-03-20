package chain_of_reponsability.desconto.desconto;

import strategy.loja.Pedido;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public abstract BigDecimal calcular(Pedido pedido);

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

}
