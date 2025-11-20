## Sistema Básico de Agenda de Contatos (Java - Console)

Este projeto em Java implementa um sistema simples de agenda de contatos, utilizando classes para modelar as entidades (**Pessoa** e **Agenda**) e exibir os dados no console.

### 🎯 Objetivo Principal

Criar uma **Agenda** capaz de armazenar objetos do tipo **Pessoa** e listar seus dados (**Nome, Sobrenome e E-mail**) no console.

-----

### 🧱 Estrutura do Projeto

O projeto segue o paradigma de Programação Orientada a Objetos (POO) e é composto por quatro classes principais, todas localizadas no pacote `com.company`:

| Classe | Papel | Descrição |
| :--- | :--- | :--- |
| **`Pessoa.java`** | **Modelo de Entidade** | Define e armazena os atributos básicos de um contato: `nome`, `sobrenome` e `email`. |
| **`Agenda.java`** | **Container de Dados** | Armazena uma lista (`ArrayList`) de objetos `Pessoa`. Inclui o método `addPessoa(Pessoa p)` para adicionar contatos. |
| **`Menu.java`** | **Utilitário de Exibição** | Contém o método `listarContatos` responsável por formatar e imprimir os dados no console. |
| **`Main.java`** | **Ponto de Entrada** | Cria instâncias de `Pessoa`, popula a `Agenda` e inicia a listagem. |

-----

### 🔍 Funcionamento

A execução do programa (`Main.java`) segue as seguintes etapas:

1.  **Criação de Contatos:** Cinco instâncias da classe `Pessoa` são criadas com dados fixos de personalidades históricas (Joana D'arc, Oscar Niemeyer, Nelson Mandela, Karl Marx e Frida Kahlo).
2.  **População da Agenda:** Uma instância de `Agenda` é criada e todas as cinco instâncias de `Pessoa` são adicionadas à sua lista interna.
3.  **Listagem:** O método `listarContatos` da classe `Menu` é chamado, passando a lista de contatos da agenda.
4.  O método itera sobre a lista e imprime os atributos de cada `Pessoa` no console, formatados sob o cabeçalho `*----------- Lista de contatos -----------*`.

### Exemplo de Saída (Console)

O programa gera a seguinte saída no console (estrutura e dados iniciais):

```
*----------- Lista de contatos -----------*
Nome: Joana
Sobrenome: D'arc
Email: revolucao@francesa.com.fr

Nome: Oscar
Sobrenome: Niemeyer
Email: construção@brasilia.com.br

Nome: Nelson
Sobrenome: Mandela
Email: apartheid@sulafricano.com.sa

Nome: Renan
Sobrenome: Belem
Email: estudante@universitario.com.br

Nome: Frida
Sobrenome: Kahlo
Email: pintora@mexicana.com.mex
```