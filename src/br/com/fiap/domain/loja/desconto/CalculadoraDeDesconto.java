package br.com.fiap.domain.loja.desconto;

import br.com.fiap.domain.loja.Pedido;

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