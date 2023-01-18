package org.example.entity;

import java.math.BigDecimal;

public class Produto {

    private final String nome;
    private final BigDecimal valor;

    public Produto(String nome, BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
