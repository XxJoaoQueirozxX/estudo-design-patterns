package br.com.fiap.application.domain.desconto;

import br.com.fiap.application.domain.loja.Pedido;

import java.math.BigDecimal;

public class DescontoPorQuantidade extends Desconto{

    public DescontoPorQuantidade(Desconto proximo) {
        super(proximo);
    }


    @Override
    protected BigDecimal aplicar(Pedido pedido) {
        return pedido.getValor().multiply(BigDecimal.valueOf(.05));
    }

    @Override
    protected boolean deveAplicar(Pedido pedido) {
        return pedido.getQuantidadeDeItens() > 10;
    }
}
