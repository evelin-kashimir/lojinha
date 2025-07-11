package com.loja.e_commerce.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class NotaFiscal {
    private Cliente cliente;
    private List<Pedido> pedidos;
    private Double valorTotal;
    private LocalDateTime dataPedido;

    public void calcularTotal() {
        this.valorTotal = pedidos.stream()
                .map(Pedido::getValorPorQuantidade)
                .reduce(0.0, Double::sum);
    }

    public void definirData() {
        this.dataPedido = LocalDateTime.now();
    }
}
