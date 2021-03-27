package br.com.fiap.application.domain.desconto;

import br.com.fiap.application.domain.loja.Pedido;

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