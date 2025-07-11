package com.loja.e_commerce.infra.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantidade;

    private Double valorPorQuantidade;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private NotaFiscal notaFiscal;
}

