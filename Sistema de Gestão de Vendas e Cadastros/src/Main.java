package com.company;
import java.util.Scanner;

//NOME DOS PARTICIPANTES: RENAN BELEM, THOMAS FRENTZEL, THEO CESAR ZANOTTO

public class Main {
    public static void main(String[] args) {
        int escolha = 0;
        Administrador a1 = new Administrador("admin", "adminSenha");
        Cadastros c1 = new Cadastros();
        float fechamentoDoDia = 0;
        while (escolha==0) {
            Scanner menu = new Scanner(System.in);
            System.out.println("!!---------- MENU ----------!!");
            System.out.println("1 - Cadastrar: Vendedor / Cliente / Fornecedor / Produto");
            System.out.println("2 - Listar: Vendedor / Cliente / Fornecedor / Produto(Estoque)");
            System.out.println("3 - Registrar venda");
            System.out.println("4 - Listar vendas");
            System.out.println("5 - Fechamento do dia");
            System.out.println("9 - Sair");
            System.out.println("Escolha a opção correspondente: ");
            System.out.print("");

            int opcao = menu.nextInt();

            if (opcao==1) {
                System.out.println("1 - Cadastrar vendedor");
                System.out.println("2 - Cadastrar cliente");
                System.out.println("3 - Cadastrar fornecedor");
                System.out.println("4 - Cadastrar produto");
                System.out.println("9 - Sair");
                System.out.println("Escolha a opção correspondente: ");
                int opcao2 = menu.nextInt();

                if (opcao2==1) {
                System.out.print("Nome: ");
                String nomev = menu.next();
                System.out.print("Sobrenome: ");
                String sobrenomev = menu.next();
                System.out.print("Data de nascimento: ");
                String dataNascimentov = menu.next();
                System.out.print("Telefone: ");
                String telefonev = menu.next();
                System.out.print("CPF: ");
                String cpfv = menu.next();
                System.out.print("Cidade: ");
                String cidadev = menu.next();
                System.out.print("Estado: ");
                String estadov = menu.next();
                System.out.print("País: ");
                String paisv = menu.next();
                System.out.print("Endereço: ");
                String enderecov = menu.next();
                System.out.print("Data do cadastro: ");
                String dataCadastrov = menu.next();
                System.out.print("Login: ");
                String login = menu.next();
                System.out.print("Senha: ");
                String senha = menu.next();
                Vendedor v1 = new Vendedor(nomev, sobrenomev, dataNascimentov, telefonev, cpfv, cidadev, estadov, paisv, enderecov, dataCadastrov, login, senha);
                c1.cadastrarVendedores(v1);
                c1.listarVendedores();
                System.out.println("Vendedor cadastrado!");
            }
                else if (opcao2==2) {
                    System.out.print("Nome: ");
                    String nomec = menu.next();
                    System.out.print("Sobrenome: ");
                    String sobrenomec = menu.next();
                    System.out.print("Data de nascimento: ");
                    String dataNascimentoc = menu.next();
                    System.out.print("Telefone: ");
                    String telefonec = menu.next();
                    System.out.print("CPF: ");
                    String cpfc = menu.next();
                    System.out.print("Cidade: ");
                    String cidadec = menu.next();
                    System.out.print("Estado: ");
                    String estadoc = menu.next();
                    System.out.print("País: ");
                    String paisc = menu.next();
                    System.out.print("Endereço: ");
                    String enderecoc = menu.next();
                    System.out.print("Número: ");
                    String numeroc = menu.next();
                    System.out.print("Data do cadastro: ");
                    String dataCadastroc = menu.next();
                    Cliente cliente1 = new Cliente(nomec, sobrenomec, dataNascimentoc, telefonec, cpfc, cidadec, estadoc, paisc, enderecoc, numeroc, dataCadastroc);
                    c1.cadastrarClientes(cliente1);
                    System.out.println("Cliente cadastrado!");
                }
                    else if (opcao2==3) {
                    System.out.print("Nome: ");
                    String nomeFantasia = menu.next();
                    System.out.print("Razão Social: ");
                    String razaoSocial = menu.next();
                    System.out.print("CNPJ: ");
                    String cnpj = menu.next();
                    System.out.print("E-mail: ");
                    String email = menu.next();
                    System.out.print("Telefone: ");
                    String telefonef = menu.next();
                    System.out.print("Cidade: ");
                    String cidadef = menu.next();
                    System.out.print("Estado: ");
                    String estadof = menu.next();
                    System.out.print("País: ");
                    String paisf = menu.next();
                    System.out.print("Endereço: ");
                    String enderecof = menu.next();
                    System.out.print("Número: ");
                    String numerof = menu.next();
                    System.out.print("Data do cadastro: ");
                    String dataCadastrof = menu.next();
                    Fornecedor f1 = new Fornecedor(nomeFantasia, razaoSocial, cnpj, email, telefonef, cidadef, estadof, paisf, enderecof, numerof, dataCadastrof);
                    c1.cadastrarFornecedores(f1);
                    System.out.println("Fornecedor cadastrado!");
                }

                else if (opcao2==4) {
                    System.out.print("Nome: ");
                    String nome = menu.next();
                    System.out.print("Descrição: ");
                    String descricao = menu.next();
                    System.out.print("Quantidade: ");
                    int quantidade = menu.nextInt();
                    System.out.print("Preço: ");
                    float preco = menu.nextFloat();
                    System.out.print("Fornecedor: ");
                    String fornecedor = menu.next();
                    if (c1.getListaFornecedores().isEmpty()){
                        System.out.println("Não há fornecedores em nosso banco de dados. Cadastre-os e tente novamente!");
                    }
                    else {
                        for (int i = 0; i < c1.getListaFornecedores().size(); i++) {
                            if (c1.getListaFornecedores().get(i).getNomeFantasia().equals(fornecedor)) {
                                Produto p1 = new Produto(nome, descricao, quantidade, preco, fornecedor);
                                c1.cadastrarProdutos(p1);
                                System.out.println("Produto cadastrado!");
                                break;
                            }
                            System.out.println("Não há fornecedores com este nome em nosso banco de dados. Tente novamente!");
                        }
                    }
                }

                else if (opcao2==9) {
                    escolha=1;
                    menu.close();
                    System.out.println("Até mais!");
                }
            }

            else if (opcao==2) {
                System.out.println("1 - Listar vendedores");
                System.out.println("2 - Listar clientes");
                System.out.println("3 - Listar fornecedores");
                System.out.println("4 - Listar produtos");
                System.out.println("9 - Sair");
                System.out.println("Escolha a opção correspondente: ");
                int opcao3 = menu.nextInt();

                if (opcao3==1) {
                    System.out.println("Login: ");
                    String login = menu.next();
                    System.out.println("Senha: ");
                    String senha = menu.next();
                    for (int i = 0; i < c1.getListaVendedores().size(); i++) {
                        if (c1.getListaVendedores().get(i).getLogin().equals(login) && c1.getListaVendedores().get(i).getSenha().equals(senha)) {
                            System.out.println("1 - Listar vendedores");
                            System.out.println("2 - Editar próprio cadastro");
                            System.out.println("Escolha a opção correspondente: ");
                            int opcaov = menu.nextInt();
                            if (opcaov==1){
                                c1.listarVendedores();
                            }
                            else if (opcaov==2){
                                System.out.println("Deseja editar qual informação cadastrada?\n(nome; sobrenome; dataNascimento; telefone; CPF; cidade; estado; pais; endereço; dataCadastro; login; senha");
                                String opcaov2 = menu.next();
                                switch(opcaov2){
                                    case "nome":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getNomev(), opcaov2);
                                    case "sobrenome":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getSobrenomev(), opcaov2);
                                    case "dataNascimento":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getDataNascimentov(), opcaov2);
                                    case "telefone":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getTelefonev(), opcaov2);
                                    case "CPF":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getCpfv(), opcaov2);
                                    case "cidade":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getCidadev(), opcaov2);
                                    case "estado":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getEstadov(), opcaov2);
                                    case "pais":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getPaisv(), opcaov2);
                                    case "endereço":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getEnderecov(), opcaov2);
                                    case "dataCadastro":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getDataCadastrov(), opcaov2);
                                    case "login":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getLogin(), opcaov2);
                                    case "senha":
                                        c1.getListaVendedores().get(i).setNomev(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaVendedores().get(i).getSenha(), opcaov2);
                                }
                            }
                            else {
                                System.out.println("Opção inválida, tente novamente!");
                            }
                        }
                        else if (login.equals("admin") && senha.equals("adminSenha")){
                            System.out.println("1 - Listar vendedores");
                            System.out.println("2 - Excluir cadastro de um vendedor");
                            System.out.println("Escolha a opção correspondente: ");
                            int opcaov = menu.nextInt();
                            if (opcaov==1){
                                c1.listarVendedores();
                            }
                            else if (opcaov==2){
                                System.out.println("Digite o nome do vendedor que deseja excluir o cadastro.");
                                String opcaov2 = menu.next();
                                if (opcaov2.equals(c1.getListaVendedores().get(i).getNomev())){
                                    c1.getListaVendedores().remove(i);
                                    break;
                                }
                                else {
                                    System.out.println("Vendedor não encontrado, tente novamente!");
                                }
                            }
                            else {
                                System.out.println("Opção inválida, tente novamente!");
                            }
                        }
                        else {
                            System.out.println("Login/senha não constam em nosso banco de dados. Tente novamente!");
                        }
                    }
                }

                else if (opcao3==2) {
                    System.out.println("Login: ");
                    String login = menu.next();
                    System.out.println("Senha: ");
                    String senha = menu.next();
                    for (int i = 0; i < c1.getListaClientes().size(); i++) {
                        if (c1.getListaVendedores().get(i).getLogin().equals(login) && c1.getListaVendedores().get(i).getSenha().equals(senha)) {
                            System.out.println("1 - Listar clientes");
                            System.out.println("2 - Editar cadastro de um dos clientes");
                            System.out.println("Escolha a opção correspondente: ");
                            int opcaov = menu.nextInt();
                            if (opcaov==1){
                                c1.listarVendedores();
                            }
                            else if (opcaov==2){
                                System.out.println("Deseja editar qual informação cadastrada?\n(nome; sobrenome; dataNascimento; telefone; CPF, cidade; estado; pais; endereço; numero; dataCadastro");
                                String opcaov2 = menu.next();
                                switch(opcaov2){
                                    case "nome":
                                        c1.getListaClientes().get(i).setNomec(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getNomec(), opcaov2);
                                    case "sobrenome":
                                        c1.getListaClientes().get(i).setSobrenomec(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getSobrenomec(), opcaov2);
                                    case "dataNascimento":
                                        c1.getListaClientes().get(i).setDataNascimentoc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getDataNascimentoc(), opcaov2);
                                    case "telefone":
                                        c1.getListaClientes().get(i).setTelefonec(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getTelefonec(), opcaov2);
                                    case "CPF":
                                        c1.getListaClientes().get(i).setCpfc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getCpfc(), opcaov2);
                                    case "cidade":
                                        c1.getListaClientes().get(i).setCidadec(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getCidadec(), opcaov2);
                                    case "estado":
                                        c1.getListaClientes().get(i).setEstadoc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getEstadoc(), opcaov2);
                                    case "pais":
                                        c1.getListaClientes().get(i).setPaisc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getPaisc(), opcaov2);
                                    case "endereço":
                                        c1.getListaClientes().get(i).setEnderecoc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getEnderecoc(), opcaov2);
                                    case "numero":
                                        c1.getListaClientes().get(i).setNumeroc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getNumeroc(), opcaov2);
                                    case "dataCadastro":
                                        c1.getListaClientes().get(i).setDataCadastroc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getDataCadastroc(), opcaov2);
                                }
                            }
                            else {
                                System.out.println("Opção inválida, tente novamente!");
                            }
                        }
                        else if (login.equals("admin") && senha.equals("adminSenha")){
                            System.out.println("1 - Listar clientes");
                            System.out.println("2 - Editar cadastro de um dos clientes");
                            System.out.println("3 - Excluir cadastro de um cliente");
                            System.out.println("Escolha a opção correspondente: ");
                            int opcaov = menu.nextInt();
                            if (opcaov==1){
                                c1.listarVendedores();
                            }
                            else if (opcaov==2){
                                System.out.println("Deseja editar qual informação cadastrada?\n(nome; sobrenome; dataNascimento; telefone; CPF, cidade; estado; pais; endereço; numero; dataCadastro");
                                String opcaov2 = menu.next();
                                switch(opcaov2){
                                    case "nome":
                                        c1.getListaClientes().get(i).setNomec(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getNomec(), opcaov2);
                                    case "sobrenome":
                                        c1.getListaClientes().get(i).setSobrenomec(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getSobrenomec(), opcaov2);
                                    case "dataNascimento":
                                        c1.getListaClientes().get(i).setDataNascimentoc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getDataNascimentoc(), opcaov2);
                                    case "telefone":
                                        c1.getListaClientes().get(i).setTelefonec(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getTelefonec(), opcaov2);
                                    case "CPF":
                                        c1.getListaClientes().get(i).setCpfc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getCpfc(), opcaov2);
                                    case "cidade":
                                        c1.getListaClientes().get(i).setCidadec(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getCidadec(), opcaov2);
                                    case "estado":
                                        c1.getListaClientes().get(i).setEstadoc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getEstadoc(), opcaov2);
                                    case "pais":
                                        c1.getListaClientes().get(i).setPaisc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getPaisc(), opcaov2);
                                    case "endereço":
                                        c1.getListaClientes().get(i).setEnderecoc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getEnderecoc(), opcaov2);
                                    case "numero":
                                        c1.getListaClientes().get(i).setNumeroc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getNumeroc(), opcaov2);
                                    case "dataCadastro":
                                        c1.getListaClientes().get(i).setDataCadastroc(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaClientes().get(i).getDataCadastroc(), opcaov2);
                                }
                            }
                            else if (opcaov==3){
                                System.out.println("Digite o nome do cliente que deseja excluir o cadastro.");
                                String opcaov2 = menu.next();
                                if (opcaov2.equals(c1.getListaClientes().get(i).getNomec())){
                                    c1.getListaClientes().remove(i);
                                    break;
                                }
                                else {
                                    System.out.println("Cliente não encontrado, tente novamente!");
                                }
                            }
                            else {
                                System.out.println("Opção inválida, tente novamente!");
                            }
                        }
                        else {
                            System.out.println("Login/senha não constam em nosso banco de dados. Tente novamente!");
                        }
                    }
                }

                else if (opcao3==3) {
                    System.out.println("Login: ");
                    String login = menu.next();
                    System.out.println("Senha: ");
                    String senha = menu.next();
                    for (int i = 0; i < c1.getListaFornecedores().size(); i++) {
                        if (c1.getListaVendedores().get(i).getLogin().equals(login) && c1.getListaVendedores().get(i).getSenha().equals(senha)) {
                            System.out.println("1 - Listar fornecedores");
                            System.out.println("2 - Editar cadastro de um dos fornecedores");
                            System.out.println("Escolha a opção correspondente: ");
                            int opcaov = menu.nextInt();
                            if (opcaov==1){
                                c1.listarFornecedores();
                            }
                            else if (opcaov==2){
                                System.out.println("Deseja editar qual informação cadastrada?\n(nomeFantasia; razaoSocial; CNPJ; email, telefone; cidade; estado; pais; endereço, numero; dataCadastro");
                                String opcaov2 = menu.next();
                                switch(opcaov2){
                                    case "nomeFantasia":
                                        c1.getListaFornecedores().get(i).setNomeFantasia(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getNomeFantasia(), opcaov2);
                                    case "razaoSocial":
                                        c1.getListaFornecedores().get(i).setRazaoSocial(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getRazaoSocial(), opcaov2);
                                    case "CNPJ":
                                        c1.getListaFornecedores().get(i).setCnpj(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getCnpj(), opcaov2);
                                    case "email":
                                        c1.getListaFornecedores().get(i).setEmail(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getEmail(), opcaov2);
                                    case "telefone":
                                        c1.getListaFornecedores().get(i).setTelefonef(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getTelefonef(), opcaov2);
                                    case "cidade":
                                        c1.getListaFornecedores().get(i).setCidadef(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getCidadef(), opcaov2);
                                    case "estado":
                                        c1.getListaFornecedores().get(i).setEstadof(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getEstadof(), opcaov2);
                                    case "pais":
                                        c1.getListaFornecedores().get(i).setPaisf(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getPaisf(), opcaov2);
                                    case "endereço":
                                        c1.getListaFornecedores().get(i).setEnderecof(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getEnderecof(), opcaov2);
                                    case "numero":
                                        c1.getListaFornecedores().get(i).setNumerof(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getNumerof(), opcaov2);
                                    case "dataCadastro":
                                        c1.getListaFornecedores().get(i).setDataCadastrof(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getDataCadastrof(), opcaov2);
                                }
                            }
                            else {
                                System.out.println("Opção inválida, tente novamente!");
                            }
                        }
                        else if (login.equals("admin") && senha.equals("adminSenha")){
                            System.out.println("1 - Listar fornecedores");
                            System.out.println("2 - Editar cadastro de um dos fornecedores");
                            System.out.println("3 - Excluir cadastro de um fornecedor");
                            System.out.println("Escolha a opção correspondente: ");
                            int opcaov = menu.nextInt();
                            if (opcaov==1){
                                c1.listarFornecedores();
                            }
                            else if (opcaov==2){
                                System.out.println("Deseja editar qual informação cadastrada?\n(nomeFantasia; razaoSocial; CNPJ; email, telefone; cidade; estado; pais; endereço, numero; dataCadastro");
                                String opcaov2 = menu.next();
                                switch(opcaov2){
                                    case "nomeFantasia":
                                        c1.getListaFornecedores().get(i).setNomeFantasia(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getNomeFantasia(), opcaov2);
                                    case "razaoSocial":
                                        c1.getListaFornecedores().get(i).setRazaoSocial(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getRazaoSocial(), opcaov2);
                                    case "CNPJ":
                                        c1.getListaFornecedores().get(i).setCnpj(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getCnpj(), opcaov2);
                                    case "email":
                                        c1.getListaFornecedores().get(i).setEmail(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getEmail(), opcaov2);
                                    case "telefone":
                                        c1.getListaFornecedores().get(i).setTelefonef(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getTelefonef(), opcaov2);
                                    case "cidade":
                                        c1.getListaFornecedores().get(i).setCidadef(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getCidadef(), opcaov2);
                                    case "estado":
                                        c1.getListaFornecedores().get(i).setEstadof(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getEstadof(), opcaov2);
                                    case "pais":
                                        c1.getListaFornecedores().get(i).setPaisf(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getPaisf(), opcaov2);
                                    case "endereço":
                                        c1.getListaFornecedores().get(i).setEnderecof(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getEnderecof(), opcaov2);
                                    case "numero":
                                        c1.getListaFornecedores().get(i).setNumerof(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getNumerof(), opcaov2);
                                    case "dataCadastro":
                                        c1.getListaFornecedores().get(i).setDataCadastrof(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaFornecedores().get(i).getDataCadastrof(), opcaov2);
                                }
                            }
                            else if (opcaov==3){
                                System.out.println("Digite o nome do fornecedor que deseja excluir o cadastro.");
                                String opcaov2 = menu.next();
                                if (opcaov2.equals(c1.getListaFornecedores().get(i).getNomeFantasia())){
                                    c1.getListaFornecedores().remove(i);
                                    break;
                                }
                                else {
                                    System.out.println("Fornecedor não encontrado, tente novamente!");
                                }
                            }
                            else {
                                System.out.println("Opção inválida, tente novamente!");
                            }
                        }
                        else {
                            System.out.println("Login/senha não constam em nosso banco de dados. Tente novamente!");
                        }
                    }
                }

                else if (opcao3==4) {
                    System.out.println("Login: ");
                    String login = menu.next();
                    System.out.println("Senha: ");
                    String senha = menu.next();
                    for (int i = 0; i < c1.getListaProdutos().size(); i++) {
                        if (c1.getListaVendedores().get(i).getLogin().equals(login) && c1.getListaVendedores().get(i).getSenha().equals(senha)) {
                            System.out.println("1 - Listar produtos");
                            System.out.println("2 - Editar cadastro de um dos produtos");
                            System.out.println("Escolha a opção correspondente: ");
                            int opcaov = menu.nextInt();
                            if (opcaov==1){
                                c1.listarProdutos();
                            }
                            else if (opcaov==2){
                                System.out.println("Deseja editar qual informação cadastrada?\n(nome; descrição; quantidade; preço; fornecedor");
                                String opcaov2 = menu.next();
                                switch(opcaov2){
                                    case "nome":
                                        c1.getListaProdutos().get(i).setNomep(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaProdutos().get(i).getNomep(), opcaov2);
                                    case "descrição":
                                        c1.getListaProdutos().get(i).setDescricao(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaProdutos().get(i).getDescricao(), opcaov2);
                                    case "quantidade":
                                        int qntd = Integer.parseInt(opcaov2);
                                        c1.getListaProdutos().get(i).setQuantidade(qntd);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaProdutos().get(i).getQuantidade(), opcaov2);
                                    case "preço":
                                        float preco = Float.parseFloat(opcaov2);
                                        c1.getListaProdutos().get(i).setPreco(preco);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaProdutos().get(i).getPreco(), opcaov2);
                                    case "fornecedor":
                                        c1.getListaProdutos().get(i).setFornecedor(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaProdutos().get(i).getFornecedor(), opcaov2);
                                }
                            }
                            else {
                                System.out.println("Opção inválida, tente novamente!");
                            }
                        }
                        else if (login.equals("admin") && senha.equals("adminSenha")){
                            System.out.println("1 - Listar produtos");
                            System.out.println("2 - Editar cadastro de um dos produtos");
                            System.out.println("3 - Excluir cadastro de um produto");
                            System.out.println("Escolha a opção correspondente: ");
                            int opcaov = menu.nextInt();
                            if (opcaov==1){
                                c1.listarProdutos();
                            }
                            else if (opcaov==2){
                                System.out.println("Deseja editar qual informação cadastrada?\n(nome; descrição; quantidade; preço; fornecedor");
                                String opcaov2 = menu.next();
                                switch(opcaov2){
                                    case "nome":
                                        c1.getListaProdutos().get(i).setNomep(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaProdutos().get(i).getNomep(), opcaov2);
                                    case "descrição":
                                        c1.getListaProdutos().get(i).setDescricao(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaProdutos().get(i).getDescricao(), opcaov2);
                                    case "quantidade":
                                        int qntd = Integer.parseInt(opcaov2);
                                        c1.getListaProdutos().get(i).setQuantidade(qntd);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaProdutos().get(i).getQuantidade(), opcaov2);
                                    case "preço":
                                        float preco = Float.parseFloat(opcaov2);
                                        c1.getListaProdutos().get(i).setPreco(preco);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaProdutos().get(i).getPreco(), opcaov2);
                                    case "fornecedor":
                                        c1.getListaProdutos().get(i).setFornecedor(opcaov2);
                                        System.out.printf("Ok! Alterado de %s para %s",c1.getListaProdutos().get(i).getFornecedor(), opcaov2);
                                }
                            }
                            else if (opcaov==3){
                                System.out.println("Digite o nome do produto que deseja excluir o cadastro.");
                                String opcaov2 = menu.next();
                                if (opcaov2.equals(c1.getListaProdutos().get(i).getNomep())){
                                    c1.getListaProdutos().remove(i);
                                    break;
                                }
                                else {
                                    System.out.println("Produto não encontrado, tente novamente!");
                                }
                            }
                            else {
                                System.out.println("Opção inválida, tente novamente!");
                            }
                        }
                        else {
                            System.out.println("Login/senha não constam em nosso banco de dados. Tente novamente!");
                        }
                    }
                }

                else if (opcao3==9){
                    escolha=1;
                    menu.close();
                    System.out.println("Até mais!");
                }

                else {
                    System.out.println("Opção inválida, tente novamente!");
                }
            }

            else if (opcao==3) {
                System.out.print("Nome do cliente: ");
                String cliente = menu.next();
                System.out.print("Nome do produto: ");
                String nomep = menu.next();
                if (c1.getListaClientes().isEmpty() || c1.getListaProdutos().isEmpty()){
                    System.out.println("Não há clientes ou produtos compatíveis em nosso banco de dados. Cadastre-os e tente novamente!");
                }
                else {
                    for (int i = 0; i < c1.getListaClientes().size(); i++) {
                        if (c1.getListaClientes().get(i).getNomec().equals(cliente)) {
                            for (int j = 0; j < c1.getListaProdutos().size(); j++) {
                                if (c1.getListaProdutos().get(j).getNomep().equals(nomep)) {
                                    c1.getListaProdutos().get(j).decQntd();
                                    System.out.print("Metódo de pagamento: ");
                                    System.out.print("1 - Crédito");
                                    System.out.print("2 - Débito");
                                    System.out.print("3 - Dinheiro");
                                    System.out.println("Escolha a opção correspondente: ");
                                    int opcao4 = menu.nextInt();
                                    if (opcao4==1){
                                        String tipoPagamento = "Crédito";
                                        Vendas v1 = new Vendas(cliente, nomep, tipoPagamento);
                                        c1.cadastrarVendas(v1);
                                        if (c1.getListaProdutos().get(j).getPreco()>1000){
                                            System.out.println("Número de parcelas possíveis:");
                                            System.out.println("1 - 1x");
                                            System.out.println("2 - 2x sem juros");
                                            System.out.println("3 - 3x sem juros");
                                            System.out.println("4 - 4x sem juros");
                                            System.out.println("5 - 5x sem juros");
                                            System.out.println("6 - 6x com juros de 5%");
                                            System.out.println("7 - 7x com juros de 5%");
                                            System.out.println("8 - 8x com juros de 5%");
                                            System.out.println("9 - 9x com juros de 5%");
                                            System.out.println("10 - 10x com juros de 5%");
                                            System.out.println("Escolha a opção correspondente: ");
                                            int parcela = menu.nextInt();
                                            if (parcela==1){
                                                System.out.println("Venda registrada no crédito sem parcelas!");
                                            }
                                            else if (parcela>=2 || parcela<=5){
                                                System.out.println("Venda registrada no crédito parcelado sem juros!");
                                            }
                                            else if (parcela<10){
                                                System.out.println("Venda registrada no crédito parcelado com juros!");
                                            }
                                            else {
                                                System.out.println("Opção inválida, tente novamente!");
                                            }
                                        }
                                        else if (c1.getListaProdutos().get(j).getPreco()<=1000){
                                            System.out.println("Número de parcelas possíveis:");
                                            System.out.println("1 - 1x");
                                            System.out.println("2 - 2x com juros de 5%");
                                            System.out.println("3 - 3x com juros de 5%");
                                            System.out.println("4 - 4x com juros de 5%");
                                            System.out.println("5 - 5x com juros de 5%");
                                            System.out.println("6 - 6x com juros de 5%");
                                            System.out.println("7 - 7x com juros de 5%");
                                            System.out.println("8 - 8x com juros de 5%");
                                            System.out.println("9 - 9x com juros de 5%");
                                            System.out.println("10 - 10x com juros de 5%");
                                            System.out.println("Escolha a opção correspondente: ");
                                            int parcela = menu.nextInt();
                                            if (parcela==1){
                                                System.out.println("Venda registrada no crédito sem parcelas!");
                                            }
                                            else if (parcela>=2){
                                                System.out.println("Venda registrada no crédito parcelado com juros!");
                                            }
                                            else {
                                                System.out.println("Opção inválida, tente novamente!");
                                            }
                                        }
                                    }
                                    else if (opcao4==2){
                                        String tipoPagamento = "Débito";
                                        Vendas v1 = new Vendas(cliente, nomep, tipoPagamento);
                                        c1.cadastrarVendas(v1);
                                        fechamentoDoDia = fechamentoDoDia+c1.getListaProdutos().get(j).getPreco();
                                        System.out.println("Venda registrada em débito!");
                                    }
                                    else if (opcao4==3){
                                        String tipoPagamento = "Dinheiro";
                                        Vendas v1 = new Vendas(cliente, nomep, tipoPagamento);
                                        c1.cadastrarVendas(v1);
                                        fechamentoDoDia = fechamentoDoDia+c1.getListaProdutos().get(j).getPreco();
                                        System.out.println("Venda registrada com dinheiro físico!");
                                    }
                                    else {
                                        System.out.println("Opção inválida, tente novamente!");
                                    }
                                    break;
                                }
                                System.out.println("Não há produtos com esta descrição em nosso banco de dados. Tente novamente!");
                            }
                            break;
                        }
                        System.out.println("Não há clientes com este nome em nosso banco de dados. Tente novamente!");
                    }
                }

            }

            else if (opcao==4) {
                c1.listarVendas();
            }

            else if (opcao==5) {
                System.out.println("Fechamento do dia:\n Débito e dinheiro no caixa: R$"+fechamentoDoDia);
            }

            else if (opcao==9){
                escolha=1;
                menu.close();
                System.out.println("Até mais!");
            }

            else {
                System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}