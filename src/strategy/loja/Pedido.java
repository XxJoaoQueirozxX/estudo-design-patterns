package strategy.loja;

import observer.PedidoHandler;
import strategy.StateException;
import strategy.loja.situacao.Situacao;
import strategy.loja.situacao.estados.Aberto;

import java.math.BigDecimal;

public class Pedido {



    private BigDecimal valor;
    private Integer quantidadeDeItens;
    private Situacao situacao;
    public PedidoHandler handler;

    public Pedido() {
        this.situacao = new Aberto();
        this.handler = new PedidoHandler();
    }

    public Pedido(BigDecimal valor) {
        this.valor = valor;
        this.quantidadeDeItens = 1;
        this.situacao = new Aberto();
        this.handler = new PedidoHandler();
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

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        handler.notify(this);
        this.situacao = situacao;
    }

    public void pagar(){
        situacao.pagar(this);
    }

    public void entregar(){
        situacao.entregar(this);
    }

    public void cancelar(){
        situacao.cancelar(this);
    }

    public void reabrir(){
        situacao.reabrir(this);
    }

    public void abrirChamado(){
        this.situacao.abrirChamado();
    }
}
