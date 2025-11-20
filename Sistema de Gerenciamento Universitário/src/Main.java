package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Universidade u1 = new Universidade();
        Curso c1 = new Curso();
        Disciplina d1 = new Disciplina();

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("!!---------- Bem vindo à Universidade POO ----------!!");
            System.out.println("1 - Cadastrar Universidade");
            System.out.println("2 - Cadastrar Estudante");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Cadastrar Curso");
            System.out.println("5 - Cadastrar Disciplina");
            System.out.println("6 - Mostrar todos os dados da Universidade");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma das opcões ----> ");
            System.out.print("");

            int opcao = scanner.nextInt();

            if (opcao == 1){
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("Endereço: ");
                    String endereco = scanner.next();
                    u1.setNome(nome);
                    u1.setEndereco(endereco);
            }
            else if (opcao == 2) {
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("CPF: ");
                String cpf = scanner.next();
                System.out.print("Idade: ");
                String idade = scanner.next();
                System.out.print("Matrícula: ");
                int matricula = scanner.nextInt();
                Estudante e1 = new Estudante(nome, cpf, idade, matricula);
                d1.addEstudante(e1);
            }
            else if (opcao == 3){
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("CPF: ");
                String cpf = scanner.next();
                System.out.print("Idade: ");
                String idade = scanner.next();
                System.out.print("Salário: ");
                Double salario = scanner.nextDouble();
                Professor p1 = new Professor(nome, cpf, idade, salario);
                d1.addProfessor(p1);
            }
            else if (opcao == 4) {
                System.out.print("Nome: ");
                String nome = scanner.next();
                c1.setNome(nome);
                u1.addCurso(c1);
            }
            else if (opcao == 5) {
                System.out.print("Nome: ");
                String nome = scanner.next();
                d1.setNome(nome);
                c1.addDisciplina(d1);
            }
            else if (opcao == 6){
                u1.DadosU();
                c1.DadosC();
                d1.DadosD();
            }
            else if (opcao == 7){
                    System.out.println("Até mais!");
                    scanner.close();
            }
            else{
                System.out.println("Opção Inválida!");
            }
    }
}}
