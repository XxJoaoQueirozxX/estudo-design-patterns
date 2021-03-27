package br.com.fiap.application;

import br.com.fiap.domain.PedidoProxy;
import br.com.fiap.domain.loja.Pedido;
import br.com.fiap.domain.loja.PedidoInterface;

import java.math.BigDecimal;

public class TesteSituacao {

    public static void main(String[] args) {
        PedidoInterface pedido = new PedidoProxy(new Pedido(new BigDecimal("100")));
//        pedido.handler.subscribe(new EmailListener());
//        pedido.handler.subscribe(new LogListener());

        System.out.println(pedido.getEndereco());


        System.out.println(pedido.getEndereco());


//        pedido.pagar();
//        System.out.println(pedido.getSituacao());


//        pedido.entregar();
//        pedido.abrirChamado();
//        System.out.println(pedido.getSituacao());
    }
}
