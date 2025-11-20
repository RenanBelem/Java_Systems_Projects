package com.company;
import java.util.ArrayList;

public class Cadastros {
    private ArrayList <Vendedor> listaVendedores;
    private ArrayList <Cliente> listaClientes;
    private ArrayList <Fornecedor> listaFornecedores;
    private ArrayList <Produto> listaProdutos;
    private ArrayList <Vendas> listaVendas;

    public Cadastros(){
        this.listaVendedores = new ArrayList<Vendedor>();
        this.listaClientes = new ArrayList<Cliente>();
        this.listaFornecedores = new ArrayList<Fornecedor>();
        this.listaProdutos = new ArrayList<Produto>();
        this.listaVendas = new ArrayList<Vendas>();
    }

    public void cadastrarVendedores(Vendedor v){
        this.listaVendedores.add(v);
    }

    public void listarVendedores(){
        System.out.println("Vendedores: ");
        for(int i = 0; i < this.listaVendedores.size(); i++){
            System.out.println("Nome: "+this.listaVendedores.get(i).getNomev()+" "+this.listaVendedores.get(i).getSobrenomev());
            System.out.println("  Data de nascimento: "+this.listaVendedores.get(i).getDataNascimentov());
            System.out.println("  Telefone: "+this.listaVendedores.get(i).getTelefonev());
            System.out.println("  CPF: "+this.listaVendedores.get(i).getCpfv());
            System.out.println("  Cidade, estado e país: "+this.listaVendedores.get(i).getCidadev()+", "+this.listaVendedores.get(i).getPaisv()+", "+this.listaVendedores.get(i).getPaisv());
            System.out.println("  Endereço: "+this.listaVendedores.get(i).getEnderecov());
            System.out.println("  Data do cadastro: "+this.listaVendedores.get(i).getDataCadastrov());
        }
    }

    public void cadastrarClientes(Cliente c){
        this.listaClientes.add(c);
    }

    public void listarClientes(){
        System.out.println("Clientes: ");
        for(int i = 0; i < this.listaClientes.size(); i++){
            System.out.println("Nome: "+this.listaClientes.get(i).getNomec()+" "+this.listaClientes.get(i).getSobrenomec());
            System.out.println("  Data de nascimento: "+this.listaClientes.get(i).getDataNascimentoc());
            System.out.println("  Telefone: "+this.listaClientes.get(i).getTelefonec());
            System.out.println("  CPF: "+this.listaClientes.get(i).getCpfc());
            System.out.println("  Cidade, estado e país: "+this.listaClientes.get(i).getCidadec()+", "+this.listaClientes.get(i).getPaisc()+", "+this.listaClientes.get(i).getPaisc());
            System.out.println("  Endereço: "+this.listaClientes.get(i).getEnderecoc());
            System.out.println("  Número: "+this.listaClientes.get(i).getNumeroc());
            System.out.println("  Data do cadastro: "+this.listaClientes.get(i).getDataCadastroc());
        }
    }

    public void cadastrarFornecedores(Fornecedor f){
        this.listaFornecedores.add(f);
    }

    public void listarFornecedores(){
        System.out.println("Fornecedores: ");
        for(int i = 0; i < this.listaFornecedores.size(); i++){
            System.out.println("Nome: "+this.listaFornecedores.get(i).getNomeFantasia());
            System.out.println("  Razão social: "+this.listaFornecedores.get(i).getRazaoSocial());
            System.out.println("  CNPJ: "+this.listaFornecedores.get(i).getCnpj());
            System.out.println("  E-mail: "+this.listaFornecedores.get(i).getEmail());
            System.out.println("  Telefone: "+this.listaFornecedores.get(i).getTelefonef());
            System.out.println("  Cidade, estado e país: "+this.listaFornecedores.get(i).getCidadef()+", "+this.listaFornecedores.get(i).getEstadof()+", "+this.listaFornecedores.get(i).getPaisf());
            System.out.println("  Endereço: "+this.listaFornecedores.get(i).getEnderecof());
            System.out.println("  Data do cadastro: "+this.listaFornecedores.get(i).getDataCadastrof());
        }
    }

    public void cadastrarProdutos(Produto p){
        this.listaProdutos.add(p);
    }

    public void listarProdutos(){
        System.out.println("Produtos: ");
        for(int i = 0; i < this.listaProdutos.size(); i++){
            System.out.println("  Nome: "+this.listaProdutos.get(i).getNomep());
            System.out.println("  Descrição: "+this.listaProdutos.get(i).getDescricao());
            System.out.println("  Quantidade: "+this.listaProdutos.get(i).getQuantidade());
            System.out.println("  Preço: "+this.listaProdutos.get(i).getPreco());
            System.out.println("  Fornecedor: "+this.listaProdutos.get(i).getFornecedor());
        }
    }

    public void cadastrarVendas(Vendas v){
        this.listaVendas.add(v);
    }

    public void listarVendas(){
        System.out.println("Vendas: ");
        for(int i = 0; i < this.listaVendas.size(); i++){
            System.out.println("Produto: "+this.listaVendas.get(i).getNomep());
            System.out.println("Cliente: "+this.listaVendas.get(i).getCliente());
            System.out.println("Quantidade do produto: "+this.listaVendas.get(i).getQntd());
            System.out.println("Tipo de pagamento: "+this.listaVendas.get(i).getTipoPagamento());
        }
    }


    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Fornecedor> getListaFornecedores() {
        return listaFornecedores;
    }

    public void setListaFornecedores(ArrayList<Fornecedor> listaFornecedores) {
        this.listaFornecedores = listaFornecedores;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public ArrayList<Vendas> getListaVendas() {
        return listaVendas;
    }

    public void setListaVendas(ArrayList<Vendas> listaVendas) {
        this.listaVendas = listaVendas;
    }
}
