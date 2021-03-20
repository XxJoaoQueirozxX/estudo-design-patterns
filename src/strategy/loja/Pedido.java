package strategy.loja;

import java.math.BigDecimal;

public class Pedido {
    private BigDecimal valor;
    private Integer quantidadeDeItens;

    public Pedido() {
    }

    public Pedido(BigDecimal valor) {
        this.valor = valor;
        this.quantidadeDeItens = 1;
    }

    public Pedido(BigDecimal valor, Integer quantidadeDeItens) {
        this.valor = valor;
        this.quantidadeDeItens = quantidadeDeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    public void setQuantidadeDeItens(Integer quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }
}
