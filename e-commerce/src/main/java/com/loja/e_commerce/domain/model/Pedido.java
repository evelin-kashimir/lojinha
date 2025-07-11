package com.loja.e_commerce.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Pedido {
    private int quantidade;
    private Double valorPorQuantidade;
    private Produto produto;

    public void calcularValorPorQuantidade() {
        if (produto != null && produto.getPreco() != null) {
            this.valorPorQuantidade = produto.getPreco() * quantidade;
        }
    }
}
