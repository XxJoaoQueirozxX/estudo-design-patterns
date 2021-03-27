package br.com.fiap.domain.loja.imposto;

import br.com.fiap.domain.loja.Pedido;

import java.math.BigDecimal;

public abstract class Imposto {
    protected Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public BigDecimal calcular(Pedido pedido){
        BigDecimal valorDoImposto = calcularImposto(pedido);
        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
        if (outroImposto != null){
            valorDoImposto = outroImposto.calcular(pedido);
        }
        return valorDoImposto.add(valorDoOutroImposto);
    }

    protected abstract BigDecimal calcularImposto(Pedido pedido);
}
