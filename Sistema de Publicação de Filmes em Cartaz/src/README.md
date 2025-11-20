## Sistema de Publicação de Filmes em Cartaz (Java Swing)

Este projeto em Java implementa uma aplicação de interface gráfica (GUI) simples, usando **Swing**, destinada a simular a publicação e exibição de nomes de filmes em um "cartaz".

### 🎯 Objetivo Principal

Permitir que o usuário insira o nome de um filme (na aba "Publicação") e visualize esse nome listado em uma tabela (na aba "Cartaz").

### 🤝 Participantes

O projeto foi desenvolvido em colaboração por: **Renan Belem Biavati, Thomas Frentzel, e Theo Cesar Zanotto**.

### 🧱 Estrutura do Projeto

O sistema é construído no pacote `com.company` e é estruturado para separar a interface gráfica, o modelo de dados e o *backend* de armazenamento.

| Arquivo | Classe | Descrição |
| :--- | :--- | :--- |
| **`Cartaz.java`** | `Cartaz` | A classe principal que estende `javax.swing.JFrame`. Contém todo o código da interface gráfica (GUI) e a lógica de eventos para adicionar um filme. |
| **`Nome.java`** | `Nome` | Classe de modelo de dados (*model*) que armazena a *string* `nome` (usada para representar o nome do filme). |
| **`Filmes.java`** | `Filmes` | O *backend* de armazenamento (`ArrayList<Nome>`). Contém o método `cadastraNome(Nome)` para adicionar um filme à lista interna. |
| **`Catalogo.java`** | `Catalogo` | Contém o método `main` principal que inicializa a aplicação e o *backend*. |

### 🖥️ Componentes da Interface (`Cartaz.java`)

A janela principal contém um `JTabbedPane` com as seguintes abas:

1.  **Aba "Publicação" (`pnPublica`):**
    * **`lbNome`:** Rótulo solicitando o nome do filme.
    * **`tfNome`:** Campo de texto (`JTextField`) para a entrada do nome do filme.
    * **`btnSalvar`:** Botão "Publicar", que executa o processo de salvamento.
2.  **Aba "Cartaz" (`jPanel2`):**
    * **`jtNomes`:** Uma tabela (`JTable`) que exibe os filmes publicados na coluna "Nome do filme".

### 🎬 Lógica de Publicação (Botão "Publicar")

O método `btnSalvarActionPerformed` (acionado pelo botão "Publicar") executa a lógica de *front-end* e *backend*:

1.  **Atualiza a Tabela (GUI):** Adiciona o texto inserido em `tfNome` diretamente à `JTable` (`jtNomes`).
2.  **Cria o Modelo:** Cria uma nova instância do objeto `Nome` com o nome do filme.
3.  **Registro (Console):** Imprime o nome do filme no console (`System.out.println(n)`).
4.  **Feedback:** Exibe uma mensagem pop-up de sucesso: "Publicação bem sucedida!!!".
5.  **Limpeza:** Limpa o campo de texto `tfNome`.

**Nota:** Embora a classe `Filmes` (`f`) exista e tenha o método `cadastraNome`, o código de evento no `Cartaz.java` não chama `f.cadastraNome(n)`. Ele apenas cria o objeto `n` e o imprime, sem persistir na lista `f.nomes`.

---

Se precisar de mais detalhes sobre a persistência de dados ou qualquer componente, me diga!