## Projetos de Sistemas em Java (Console & Swing)

Este repositório contém uma coleção de projetos desenvolvidos em Java que demonstram a aplicação de conceitos de Programação Orientada a Objetos (POO) e estruturas de dados para simular sistemas de gerenciamento e serviços.

Os projetos se dividem em sistemas baseados em **Console** (foco em lógica e *backend*) e aplicações com interface **Swing** (foco em GUI básica).

---

### 1. Sistemas de Gerenciamento e Transações (Console)

Estes projetos utilizam a interface de console para interagir com o usuário e processar a lógica de negócio.

#### 🏦 Sistema de Gerenciamento Bancário
| Arquivo Principal | Foco | Características |
| :--- | :--- | :--- |
| `Gerente.py`, `Cliente.py` | **Contas e Investimentos** | Simula operações de **saque, depósito e consulta de saldo**. Implementa lógicas de **simulação de investimento** com juros compostos e taxas administrativas. Acesso dividido entre Gerente (cadastro, busca) e Cliente (transações). |
| **Sistema de Gestão de Vendas e Cadastros** | `Main.java`, `Cadastros.java`, etc. | Sistema para gerenciar **cadastros** (Vendedores, Clientes, Fornecedores, Produtos) e **registrar vendas**. Possui controle de estoque (`Produto.decQntd()`) e cálculo de **fechamento de caixa** (Débito/Dinheiro). |
| **Sistema de Gerenciamento Universitário** | `Main.java`, `Universidade.java`, etc. | Implementa uma estrutura hierárquica de dados: **Universidade** $\to$ **Curso** $\to$ **Disciplina** $\to$ **Estudantes/Professores**. Demonstra o uso de Herança (`Estudante` e `Professor` extendem `Pessoa`) e Composição (listas aninhadas). |
| **Sistema Básico de Agenda de Contatos** | `Main.java`, `Agenda.java`, `Pessoa.java`, etc. | Um exemplo simples de armazenamento (`Agenda`) e listagem (`Menu`) de contatos (`Pessoa`) com Nome, Sobrenome e E-mail no console. |
| **Sistema de Pedidos de Pizzaria** | `Main.java`, `Pedido.java`, `Pizza.java`, etc. | Modela a criação de um `Pedido` que acumula clientes e múltiplas `Pizza`s. Contém a lógica de cálculo do **valor total do pedido**. |

***

### 2. Aplicações com Interface Gráfica (Swing)

Estes projetos utilizam o Java Swing para criar interfaces básicas.

#### 🎬 Sistema de Publicação de Filmes em Cartaz
| Arquivo Principal | Foco | Componentes |
| :--- | :--- | :--- |
| `Cartaz.java` | **GUI e JTable** | Aplicação com `JTabbedPane` (abas "Publicação" e "Cartaz"). Permite digitar um nome (`JTextField`) e publicá-lo em uma lista (`JTable`) na aba "Cartaz". |

---

### 🗃️ Modelo de Dados Comum

A maioria dos projetos utiliza a modelagem de classes para isolar as entidades e suas propriedades:

* **Entidade:** Estrutura básica (`Pessoa.java`, `Vendedor.java`, `Produto.java`) com atributos privados e métodos *getter* e *setter*.
* **Coleções:** Uso de `ArrayList` para armazenar coleções de objetos (ex: `listaVendedores` em `Cadastros.java`).
