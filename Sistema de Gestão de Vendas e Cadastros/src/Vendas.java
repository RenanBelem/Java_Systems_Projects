package com.company;
import java.util.ArrayList;

public class Vendas {
    private Cliente cliente;
    private Produto nomep;
    private ArrayList<Produto> qntd;
    private String tipoPagamento;

    public Vendas(String cliente, String nomep, String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
        this.qntd = new ArrayList<Produto>();
    }

    public Produto getNomep() {
        return nomep;
    }

    public void setNomep(Produto nomep) {
        this.nomep = nomep;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public ArrayList<Produto> getQntd() {
        return qntd;
    }

    public void setQntd(ArrayList<Produto> qntd) {
        this.qntd = qntd;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
