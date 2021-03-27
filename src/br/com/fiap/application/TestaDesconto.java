package br.com.fiap.application;

import br.com.fiap.domain.desconto.CalculadoraDeDesconto;
import br.com.fiap.domain.loja.Pedido;

import java.math.BigDecimal;

public class TestaDesconto {
    public static void main(String[] args) {
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        Pedido p = new Pedido(new BigDecimal("100"), 15);

        BigDecimal desconto = calculadoraDeDesconto.calcular(p);
        System.out.println(desconto);

    }
}
