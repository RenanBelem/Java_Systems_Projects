## Sistema de Pedidos de Pizzaria (Java - Console)

Este projeto em Java simula um sistema simples de pedidos de pizza através de uma interface de console. O foco está na modelagem de entidades (Pessoa, Pizza, Pedido) e no cálculo do valor total.

### 🍕 Estrutura do Projeto

O sistema é construído no pacote `com.company` e segue o paradigma de Programação Orientada a Objetos (POO).

| Arquivo | Classe | Descrição |
| :--- | :--- | :--- |
| **`Pessoa.java`** | `Pessoa` | Classe de modelo para o cliente, armazenando `nome`, `telefone` e `endereco`. |
| **`Pizza.java`** | `Pizza` | Classe de modelo para a pizza, armazenando `sabor`, `tamanho` e `preco`. |
| **`Pedido.java`** | `Pedido` | A classe principal de negócio. Gerencia as listas de clientes e pizzas e contém a lógica para calcular o valor total e mostrar os dados do pedido. |
| **`Main.java`** | `Main` | O ponto de entrada do programa. Contém o menu interativo e a lógica de recebimento de *inputs*. |

### ⚙️ Funcionalidades e Fluxo Principal (`Main.java`)

A classe `Main` apresenta um menu em *loop* infinito, permitindo ao usuário interagir com o sistema.

#### Menu de Opções
1.  **Novo Cadastro:** Registra os dados de um cliente (`Pessoa`) e adiciona à lista de clientes do pedido.
2.  **Adicionar pizza ao pedido:** Registra uma pizza (`Pizza`) com sabor, tamanho e preço, e adiciona à lista de pizzas do pedido.
3.  **Valor total do pedido:** Calcula e exibe o valor total somando o preço de todas as pizzas.
4.  **Mostrar dados do pedido:** Exibe os dados do(s) cliente(s) e de todas as pizzas adicionadas ao pedido.
5.  **Sair:** Encerra o programa.

### ⚠️ Problema de Escopo (Nota do Desenvolvedor)

O desenvolvedor incluiu uma nota no código (`Main.java`, `case 3`) indicando um problema de escopo:

> *Não sei porque quando chamo o case 3 e 4 não está gravando os dados das entradas de dados do case 1 e 2...*

**Explicação:** O objeto `p1` (Pedido) é **reinicializado (criado com `new Pedido()`) a cada iteração do loop `while(true)`** no método `main`. Isso significa que os dados adicionados nos `case 1` e `case 2` são perdidos sempre que o menu é exibido novamente, a menos que as operações `case 1` e `case 2` sejam realizadas *imediatamente* antes de `case 3` ou `case 4`.

Para que o pedido persista, a inicialização de `p1` deveria ocorrer **antes** do loop `while(true)`.

### 🧮 Lógica de Negócio (`Pedido.java`)

A classe `Pedido` lida com as coleções e cálculos:

* **`calcularValorTotalPedido()`:** Itera sobre a `listaPizzas` e acumula o `preco` de cada pizza no `valorPedido`, exibindo o total no console.
* **`mostrarDadosPedido()`:** Itera e imprime os detalhes de contato de todos os clientes e os detalhes (Sabor, Tamanho, Preço) de todas as pizzas.