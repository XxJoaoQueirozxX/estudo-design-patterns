package br.com.fiap.application.domain.loja.imposto;

import br.com.fiap.application.domain.loja.Pedido;

import java.math.BigDecimal;

public class ICMS implements Imposto{
    @Override
    public BigDecimal calcular(Pedido pedido) {
        return pedido.getValor().multiply(BigDecimal.valueOf(.1));
    }
}
