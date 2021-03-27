package br.com.fiap.domain.loja.imposto;

import br.com.fiap.domain.loja.Pedido;

import java.math.BigDecimal;

public class IPI extends Imposto{


    public IPI(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public BigDecimal calcularImposto(Pedido pedido) {
        return pedido.getValor().multiply(BigDecimal.valueOf(.04));
    }
}
