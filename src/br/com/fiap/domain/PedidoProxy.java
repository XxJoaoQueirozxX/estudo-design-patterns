package br.com.fiap.domain;

import br.com.fiap.domain.loja.Pedido;
import br.com.fiap.domain.loja.PedidoInterface;
import br.com.fiap.domain.loja.situacao.Situacao;

import java.math.BigDecimal;

public class PedidoProxy implements PedidoInterface {
    private Pedido pedido;
    private String endereco;

    public PedidoProxy(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String getEndereco() {
        if (endereco == null){
            endereco = pedido.getEndereco();
        }
        return endereco;
    }


    @Override
    public BigDecimal getValor() {
        return pedido.getValor();
    }

    @Override
    public void setValor(BigDecimal valor) {
        pedido.setValor(valor);
    }

    @Override
    public Integer getQuantidadeDeItens() {
        return pedido.getQuantidadeDeItens();
    }

    @Override
    public void setQuantidadeDeItens(Integer quantidadeDeItens) {
        pedido.setQuantidadeDeItens(quantidadeDeItens);
    }

    @Override
    public Situacao getSituacao() {
        return pedido.getSituacao();
    }

    @Override
    public void setSituacao(Situacao situacao) {
        pedido.setSituacao(situacao);
    }

    @Override
    public void pagar() {
        pedido.pagar();
    }

    @Override
    public void entregar() {
        pedido.entregar();
    }

    @Override
    public void cancelar() {
        pedido.cancelar();
    }

    @Override
    public void reabrir() {
        pedido.reabrir();
    }

    @Override
    public void abrirChamado() {
        pedido.abrirChamado();
    }
}
