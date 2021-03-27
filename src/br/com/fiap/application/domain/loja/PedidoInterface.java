package br.com.fiap.application.domain.loja;

import br.com.fiap.application.domain.loja.situacao.Situacao;

import java.math.BigDecimal;

public interface PedidoInterface {
    String getEndereco();

    BigDecimal getValor();

    void setValor(BigDecimal valor);

    Integer getQuantidadeDeItens();

    void setQuantidadeDeItens(Integer quantidadeDeItens);

    Situacao getSituacao();

    void setSituacao(Situacao situacao);

    void pagar();

    void entregar();

    void cancelar();

    void reabrir();

    void abrirChamado();
}
