package br.com.fiap.domain.loja.imposto;

import br.com.fiap.domain.loja.Pedido;

import java.math.BigDecimal;

public class TestaImposto {
    public static void main(String[] args) {
        try{
            CalculadoraDeImposto c = new CalculadoraDeImposto(null);
            c.setImposto(new ICMS());
            Pedido pedido = new Pedido(new BigDecimal("100"));
            BigDecimal imposto = c.calcular(pedido);
            System.out.println(imposto);
        } catch (IllegalStateException e){
            System.out.println("error: " + e.getMessage());
        }

    }
}
