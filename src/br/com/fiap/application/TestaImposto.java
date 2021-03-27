package br.com.fiap.application;

import br.com.fiap.domain.loja.Pedido;
import br.com.fiap.domain.loja.PedidoInterface;
import br.com.fiap.domain.loja.imposto.CalculadoraDeImposto;
import br.com.fiap.domain.loja.imposto.ICMS;
import br.com.fiap.domain.loja.imposto.IPI;
import br.com.fiap.domain.loja.imposto.ISS;

import java.math.BigDecimal;

public class TestaImposto {
    public static void main(String[] args) {
        try{

            CalculadoraDeImposto c = new CalculadoraDeImposto(null);

            c.setImposto(new ICMS(new ISS(new IPI(null))));

            Pedido pedido = new Pedido(new BigDecimal("100"));

            BigDecimal imposto = c.calcular(pedido);

            System.out.println(imposto);



        } catch (IllegalStateException e){
            System.out.println("error: " + e.getMessage());
        }

    }
}
