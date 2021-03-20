package state;

import strategy.loja.Pedido;

import java.math.BigDecimal;

public class TesteSituacao {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(new BigDecimal("100"));
        System.out.println(pedido.getSituacao());


        pedido.pagar();
        System.out.println(pedido.getSituacao());


        pedido.entregar();
        pedido.abrirChamado();
        System.out.println(pedido.getSituacao());
    }
}
