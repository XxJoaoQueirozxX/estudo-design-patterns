package chain_of_reponsability.desconto.desconto;

import strategy.loja.Pedido;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Pedido pedido){
        Desconto cadeiaDeDesconto =
                new DescontoPorValor(
                new DescontoPorQuantidade(
                new SemDesconto()
                ));

        return cadeiaDeDesconto.calcular(pedido);
    }
}