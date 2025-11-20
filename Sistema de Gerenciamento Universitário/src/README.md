## Sistema de Gerenciamento Universitário (Java - Console)

Este projeto em Java implementa um sistema simples para gerenciar dados de uma universidade, incluindo cursos, disciplinas, estudantes e professores, utilizando o paradigma de Programação Orientada a Objetos (POO) e classes com herança.

O sistema é operado através de um menu interativo no console, permitindo o cadastro de entidades e a exibição hierárquica dos dados.

### 🧱 Estrutura do Projeto

O projeto é baseado em um modelo de herança para as entidades (Pessoas) e um modelo de composição para as instituições (Universidade, Curso, Disciplina). Todas as classes pertencem ao pacote `com.company`.

#### Modelo de Entidades (Herança)

| Classe | Herda de | Atributos Exclusivos | Descrição |
| :--- | :--- | :--- | :--- |
| **`Pessoa.java`** | N/A | `nome`, `cpf`, `idade` | Classe base para todas as pessoas no sistema. |
| **`Estudante.java`** | `Pessoa` | `matricula` | Representa um estudante. |
| **`Professor.java`** | `Pessoa` | `salario` | Representa um professor. |

#### Modelo Hierárquico de Instituições (Composição)

| Classe | Contém (Lista de) | Descrição |
| :--- | :--- | :--- |
| **`Universidade.java`** | `Curso` | Armazena o nome e endereço da universidade e a lista de cursos oferecidos. |
| **`Curso.java`** | `Disciplina` | Armazena o nome do curso e a lista de disciplinas que o compõem. |
| **`Disciplina.java`** | `Estudante`, `Professor` | Armazena o nome da disciplina e listas de estudantes e professores associados a ela. |

### ⚙️ Funcionalidades e Menu Interativo (`Main.java`)

A classe `Main` contém o método principal que inicializa o sistema com instâncias de `Universidade` (`u1`), `Curso` (`c1`) e `Disciplina` (`d1`) e exibe o menu de opções.

| Opção | Ação | Entidade Afetada |
| :---: | :--- | :--- |
| **1** | Cadastrar Universidade | `u1` (Nome, Endereço) |
| **2** | Cadastrar Estudante | Adiciona à `listaEstudantes` da `d1` (Disciplina) |
| **3** | Cadastrar Professor | Adiciona à `listaProfessores` da `d1` (Disciplina) |
| **4** | Cadastrar Curso | Adiciona à `listaCursos` da `u1` (Universidade) |
| **5** | Cadastrar Disciplina | Adiciona à `listaDisciplinas` do `c1` (Curso) |
| **6** | Mostrar todos os dados | Exibe dados de `u1`, `c1` e `d1` |
| **7** | Sair | Encerra o programa |

### 📊 Exibição dos Dados (Opção 6)

Os métodos de exibição (`DadosU`, `DadosC`, `DadosD`) percorrem as listas e imprimem os dados no console de forma estruturada:

* **`u1.DadosU()`:** Exibe nome, endereço da Universidade e lista de Nomes de Cursos.
* **`c1.DadosC()`:** Exibe lista de Nomes de Disciplinas.
* **`d1.DadosD()`:** Exibe listas detalhadas de Professores (Nome, CPF, Idade, Salário) e Estudantes (Nome, CPF, Idade, Matrícula) da Disciplina.

**Nota sobre Composição:** O `Main.java` opera com apenas uma instância de `Curso` (`c1`) e uma instância de `Disciplina` (`d1`), o que significa que todos os Estudantes e Professores cadastrados são adicionados à mesma instância de `d1`, e todas as disciplinas cadastrada são adicionadas à mesma instância de `c1`.