package br.com.fiap.domain.loja;

import br.com.fiap.domain.observer.PedidoHandler;
import br.com.fiap.domain.loja.situacao.Situacao;
import br.com.fiap.domain.loja.situacao.estados.Aberto;

import java.math.BigDecimal;

public class Pedido implements PedidoInterface {



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


    @Override
    public String getEndereco(){
        try {
            Thread.sleep(3000);
            return "Endereco";
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "Endereco";
        }
    }

    @Override
    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public Integer getQuantidadeDeItens() {
        return quantidadeDeItens;
    }

    @Override
    public void setQuantidadeDeItens(Integer quantidadeDeItens) {
        this.quantidadeDeItens = quantidadeDeItens;
    }

    @Override
    public Situacao getSituacao() {
        return situacao;
    }

    @Override
    public void setSituacao(Situacao situacao) {
        handler.notify(this);
        this.situacao = situacao;
    }

    @Override
    public void pagar(){
        situacao.pagar(this);
    }

    @Override
    public void entregar(){
        situacao.entregar(this);
    }

    @Override
    public void cancelar(){
        situacao.cancelar(this);
    }

    @Override
    public void reabrir(){
        situacao.reabrir(this);
    }

    @Override
    public void abrirChamado(){
        this.situacao.abrirChamado();
    }
}
