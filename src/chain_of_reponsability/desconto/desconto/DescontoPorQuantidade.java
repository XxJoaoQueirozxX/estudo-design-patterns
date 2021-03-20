package chain_of_reponsability.desconto.desconto;

import strategy.loja.Pedido;

import java.math.BigDecimal;

public class DescontoPorQuantidade extends Desconto{

    public DescontoPorQuantidade(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Pedido pedido) {
        if (pedido.getQuantidadeDeItens() > 10) {
            return pedido.getValor().multiply(BigDecimal.valueOf(.05));
        }else {
            return BigDecimal.ZERO;
        }
    }
}
