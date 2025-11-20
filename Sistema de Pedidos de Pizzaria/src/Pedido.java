package com.company;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<Pessoa> listaClientes;
    private double valorPedido = 0.0;
    private ArrayList <Pizza> listaPizzas;

    public Pedido(){
        this.listaClientes = new ArrayList<Pessoa>();
        this.listaPizzas = new ArrayList<Pizza>();
    }

    public void addPizza(Pizza p){
        this.listaPizzas.add(p);
    }

    public void addCliente(Pessoa p){
        this.listaClientes.add(p);
    }

    public void calcularValorTotalPedido(){
        System.out.print("Valor do pedido: R$");
        for(int i=0; i < this.listaPizzas.size(); i++){
            valorPedido += this.listaPizzas.get(i).getPreco();
        }
        System.out.println(this.valorPedido);
    }

    public void mostrarDadosPedido(){
        System.out.print("");
        System.out.println("*-----Pedido-----*");
        for(int i = 0; i < this.listaClientes.size(); i++){
            System.out.println("Nome: "+this.listaClientes.get(i).getNome());
            System.out.println("Telefone: "+this.listaClientes.get(i).getTelefone());
            System.out.println("Endereço: "+this.listaClientes.get(i).getEndereco());
        }
        for(int i = 0; i < this.listaPizzas.size(); i++){
            System.out.println("Sabor: "+this.listaPizzas.get(i).getSabor());
            System.out.println("Tamanho: "+this.listaPizzas.get(i).getTamanho());
            System.out.println("Preço: "+this.listaPizzas.get(i).getPreco());
        }
    }

    public ArrayList<Pessoa> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Pessoa> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public ArrayList<Pizza> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<Pizza> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }
}
