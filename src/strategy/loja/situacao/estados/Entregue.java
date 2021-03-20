package strategy.loja.situacao.estados;

import strategy.loja.situacao.Situacao;

public class Entregue extends Situacao {
    @Override
    public void abrirChamado() {
        System.out.println("Abrir para o pos venda");
    }
}
