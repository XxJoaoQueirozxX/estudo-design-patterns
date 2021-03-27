package br.com.fiap.domain.loja.imposto;

import br.com.fiap.domain.loja.Pedido;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calcular(Pedido pedido);
}
