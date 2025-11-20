## Sistema de Cadastro e Exibição de Cartazes (Java Swing)

Este projeto em Java implementa uma aplicação de interface gráfica (GUI) simples usando **Swing** para cadastrar nomes de filmes e exibi-los em uma tabela simulando um "cartaz".

### 🎯 Objetivo Principal

O objetivo do sistema é capturar o nome de um filme (via campo de texto), registrar essa informação e, em seguida, exibi-la em uma lista (JTable) na aba de Cartaz.

### 🧱 Estrutura do Projeto

O projeto é dividido em um pacote `cadastro` e possui a seguinte estrutura de classes:

| Arquivo | Classe | Descrição |
| :--- | :--- | :--- |
| **`JanelaCadastro.java`** | `JanelaCadastro` | A classe principal que estende `javax.swing.JFrame`. Contém todo o código da interface gráfica (gerado via *GUI builder* ou codificação manual) e a lógica de eventos (botões). |
| **`Contato.java`** | `Contato` | Uma classe de modelo simples que armazena uma única *string* (`nome`). É usada aqui para modelar o nome do filme. |
| **`Dados.java`** | `Dados` | Uma classe utilitária que contém uma lista (`ArrayList<Contato>`) para armazenar os dados cadastrados. Embora a funcionalidade de adicionar à lista não seja diretamente chamada no código do evento `btnSalvar`, a intenção é persistir os dados aqui. |
| **`ListaDeContatos.java`**| `ListaDeContatos` | Classe com um método `main` alternativo para iniciar a aplicação, demonstrando a criação e exibição da janela principal. |

### 🖥️ Componentes da Interface (`JanelaCadastro.java`)

A janela principal contém um `JTabbedPane` com duas abas:

1.  **Aba "Publicação" (`pnCadastro`):**
    * **`lbNome`:** Rótulo "Digite o nome do filme para publicar no cartaz:".
    * **`tfNome`:** Campo de texto (`JTextField`) para a entrada do nome do filme.
    * **`btnSalvar`:** Botão "Publicar", que dispara o evento de salvamento.
2.  **Aba "Cartaz" (`jPanel2`):**
    * **`jtNomes`:** Uma tabela (`JTable`) que exibe a lista de filmes cadastrados em uma coluna chamada "Nome do filme".

### 🎬 Lógica de Evento (Botão "Publicar")

O método `btnSalvarActionPerformed` é acionado quando o usuário clica em "Publicar":

1.  **Captura de Dados:** O texto do campo `tfNome` é obtido (`tfNome.getText()`).
2.  **Atualização da Tabela (Cartaz):** O nome do filme é adicionado como uma nova linha na tabela `jtNomes`.
3.  **Criação do Objeto:** Um novo objeto `Contato` (representando o filme) é criado com o nome inserido.
4.  **Feedback:** Uma mensagem de sucesso (`JOptionPane`) é exibida: "Publicação bem sucedida!!!".
5.  **Limpeza:** O campo de texto `tfNome` é limpo.

**Observação:** O código imprime o objeto `Contato` no console (`System.out.println(c)`), que, devido ao método `toString()` da classe `Contato`, imprime apenas o nome do filme.