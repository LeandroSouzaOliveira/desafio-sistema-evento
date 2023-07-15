package com.devsuperior.systemevento.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String descricao;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Atividade() {
    }

    public Atividade(Long id, String name, String descricao, Double preco, Categoria categoria) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atividade atividade)) return false;
        return Objects.equals(getId(), atividade.getId()) && Objects.equals(getName(), atividade.getName()) && Objects.equals(getDescricao(), atividade.getDescricao()) && Objects.equals(getPreco(), atividade.getPreco()) && Objects.equals(getCategoria(), atividade.getCategoria());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescricao(), getPreco(), getCategoria());
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }
}
