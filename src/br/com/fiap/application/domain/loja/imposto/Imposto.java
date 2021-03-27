package br.com.fiap.application.domain.loja.imposto;

import br.com.fiap.application.domain.loja.Pedido;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calcular(Pedido pedido);
}
