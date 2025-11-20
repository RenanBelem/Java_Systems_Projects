package com.company;

public class Produto {
    private String nomep;
    private String descricao;
    private int quantidade;
    private float preco;
    private String fornecedor;

    public Produto(String nomep, String descricao, int quantidade, float preco, String fornecedor){
        this.nomep = nomep;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void decQntd(){
        this.quantidade = quantidade-1;
    }

    public String getNomep() {
        return nomep;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
