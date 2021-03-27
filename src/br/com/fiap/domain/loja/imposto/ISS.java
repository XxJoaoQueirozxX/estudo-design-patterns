package br.com.fiap.domain.loja.imposto;

import br.com.fiap.domain.loja.Pedido;

import java.math.BigDecimal;

public class ISS extends Imposto{

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal calcularImposto(Pedido pedido) {
        return pedido.getValor().multiply(BigDecimal.valueOf(.02));
    }
}
