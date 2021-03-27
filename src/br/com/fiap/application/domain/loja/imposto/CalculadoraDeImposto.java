package br.com.fiap.application.domain.loja.imposto;

import br.com.fiap.application.domain.loja.Pedido;

import java.math.BigDecimal;

public class CalculadoraDeImposto {
    private Imposto imposto;

    public CalculadoraDeImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public BigDecimal calcular(Pedido pedido){
        if (imposto == null){
            throw new IllegalStateException("Imposto has null");
        }
        return imposto.calcular(pedido);
    }
}
