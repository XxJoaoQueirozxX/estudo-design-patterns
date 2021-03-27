package br.com.fiap.domain.loja.situacao;

import br.com.fiap.domain.loja.PedidoInterface;

public class ChamadoFacade {

    public void abrir(PedidoInterface pedido){
        System.out.println("Registro no sistema de CRM");
        System.out.println("Registro no sistema de HP");
        System.out.println("SMS Gerente");
        System.out.println("Chamado aberto para financeiro");
    }
}
