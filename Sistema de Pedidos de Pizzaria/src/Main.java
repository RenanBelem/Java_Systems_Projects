package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
        Scanner menu = new Scanner(System.in);
        System.out.println("!!---------- MENU ----------!!");
        System.out.println("1 - Novo Cadastro");
        System.out.println("2 - Adicionar pizza ao pedido");
        System.out.println("3 - Valor total do pedido");
        System.out.println("4 - Mostrar dados do pedido (Cliente e Pizza)");
        System.out.println("5 - Sair");
        System.out.println("Escolha a opção correspondente: ");
        System.out.print("");

        Pedido p1 = new Pedido();
        int opcao = menu.nextInt();

            switch (opcao){
            case 1:
                System.out.print("Nome: ");
                String nome = menu.next();
                System.out.print("Telefone: ");
                String telefone = menu.next();
                System.out.print("Endereço: ");
                String endereco = menu.next();
                Pessoa pessoa1 = new Pessoa(nome, telefone, endereco);
                p1.addCliente(pessoa1);
                break;

            case 2:
                System.out.print("Sabor: ");
                String sabor = menu.next();
                System.out.print("Tamanho: ");
                String tamanho = menu.next();
                System.out.print("Preço: ");
                Double preco = menu.nextDouble();
                Pizza pizza1 = new Pizza(sabor, tamanho, preco);
                p1.addPizza(pizza1);
                //p1.calcularValorTotalPedido();
                //p1.mostrarDadosPedido();
                break;

            case 3:
                //Não sei porque quando chamo o case 3 e 4 não está gravando os dados das entradas de dados do case 1 e 2,
                //quando coloquei as funções p1.calcularValorTotalPedido() e p1.mostrarDadosPedido() no case 2,
                //os dados apareceram, não consegui resolver isso
                p1.calcularValorTotalPedido();
                break;

            case 4:
                p1.mostrarDadosPedido();
                break;

            default:
                System.out.println("Opção Inválida!");
                break;

            case 5:
                System.out.println("Até mais!");
                menu.close();
        }}
    }
}