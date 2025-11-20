## Sistema de Gestão de Vendas e Cadastros (Java - Console)

Este projeto em Java implementa um sistema básico de gerenciamento para uma empresa, utilizando uma interface de console para lidar com **cadastros de entidades** (Vendedores, Clientes, Fornecedores, Produtos) e **operações de venda**.

### 🤝 Participantes
O projeto foi desenvolvido em colaboração por: **Renan Belem Biavati, Thomas Frentzel, e Theo Cesar Zanotto**.

### 🧱 Estrutura do Projeto (POO)

O sistema utiliza classes em Java para modelar as entidades e a lógica de negócio, todas localizadas no pacote `com.company`.

#### Classes de Entidade
| Classe | Descrição | Atributos Notáveis |
| :--- | :--- | :--- |
| **`Vendedor.java`** | Representa o funcionário; inclui dados pessoais e **login/senha** para acesso ao menu de listagem. | `login`, `senha` |
| **`Cliente.java`** | Armazena dados de contato e endereço do cliente. | `cpf`, `dataNascimentoc` |
| **`Fornecedor.java`** | Armazena dados da empresa fornecedora. | `nomeFantasia`, `razaoSocial`, `cnpj` |
| **`Produto.java`** | Armazena informações do produto e seu preço. | `quantidade`, `preco`, `fornecedor` |
| **`Vendas.java`** | Registra uma venda, associando o cliente e o produto vendido. | `tipoPagamento`, `qntd` (lista de produtos) |
| **`Administrador.java`** | Define as credenciais de acesso administrativas. | `loginAdmin`="admin", `senha`="adminSenha"|

#### Classes de Gerenciamento
| Classe | Descrição |
| :--- | :--- |
| **`Cadastros.java`** | Classe central que gerencia cinco listas (`ArrayList`): Vendedores, Clientes, Fornecedores, Produtos e Vendas. Contém todos os métodos para cadastrar e listar essas entidades. |
| **`Main.java`** | Contém o *loop* principal do console, o menu, a lógica de login e todo o fluxo de interação e processamento de vendas. |

### ⚙️ Funcionalidades e Fluxo Principal (`Main.java`)

O sistema opera em um *loop* contínuo no console, guiado por um menu principal:

#### Menu Principal
1.  **Cadastrar:** Inclui sub-opções para Vendedor, Cliente, Fornecedor e Produto.
2.  **Listar:** Permite listar todas as entidades (com controle de acesso).
3.  **Registrar Venda:** Lançamento de transações.
4.  **Listar Vendas:** Exibe o histórico de vendas.
5.  **Fechamento do Dia:** Exibe o total arrecadado em Débito e Dinheiro.
9.  **Sair:** Encerra o programa.

---

### 1. Cadastro de Entidades (Opção 1)

* **Vendedor, Cliente, Fornecedor:** O cadastro é direto, solicitando todos os atributos da respectiva classe.
* **Produto:** O cadastro de um produto depende da existência de um Fornecedor com o `nomeFantasia` correspondente no sistema.

### 2. Controle de Acesso e Edição (Opção 2 - Listar)

O acesso às listas de cadastros e as funcionalidades de edição/exclusão são controlados por um sistema de login:

| Usuário | Permissões Específicas (Login na Opção 2) |
| :--- | :--- |
| **Vendedor** | Listar todos os Vendedores e **Editar** seu **próprio** cadastro. |
| **Administrador** (`admin`/`adminSenha`) | Listar, **Editar** e **Excluir** cadastros de Clientes, Fornecedores e Produtos. |

### 3. Registro de Venda (Opção 3)

O sistema verifica se o Cliente e o Produto existem antes de processar a transação.

* **Controle de Estoque:** Se a venda for bem-sucedida, a quantidade do produto é diminuída em 1 (`decQntd()`).
* **Métodos de Pagamento:**
    * **Débito / Dinheiro:** O preço do produto é somado à variável `fechamentoDoDia`.
    * **Crédito:** O sistema simula opções de parcelamento com ou sem juros (5%) dependendo se o preço do produto é **maior que R$1000** ou **menor ou igual a R$1000**.

### 4. Fechamento do Dia (Opção 5)

Exibe o valor total acumulado no caixa, proveniente de vendas pagas nos métodos **Débito** e **Dinheiro**.

---