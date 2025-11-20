package com.company;

public class Pizza {
    private String sabor;
    private String tamanho;
    private double preco;

    public Pizza(String sabor, String tamanho, Double preco){
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

