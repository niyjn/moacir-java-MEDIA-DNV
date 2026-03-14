# Repositório de Trabalhos da Faculdade em Java

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Este repositório serve como um arquivo central para os diversos trabalhos e exercícios de programação desenvolvidos na linguagem Java durante o período da faculdade. O objetivo é documentar e organizar os projetos, que abrangem desde conceitos básicos de lógica de programação até aplicações mais estruturadas utilizando Programação Orientada a Objetos (POO).

---

## 📂 Estrutura do Repositório

O código-fonte de todos os projetos está localizado no diretório `src/`. Para manter a organização e o isolamento entre os trabalhos, cada subdiretório dentro de `src/` representa um projeto ou um conjunto de exercícios independentes.

```
src/
├── ExerciciosClasse        (Exercícios de Classes e Encapsulamento)
│   ├── Animais             (Gestão de Animais e Espécies)
│   ├── Biblioteca          (Sistema de Livros com Validação de Ano)
│   └── Notas               (Sistema de Alunos com Saldo de Nota Limitado)
├── ExerciciosConstrutor    (Foco em inicialização, Scanner e Desafios)
│   ├── Leitura.java        (Entrada de dados com Scanner)
│   ├── ListaRandom.java    (Manipulação de vetores com Random)
│   ├── Produto.java        (Uso de construtores para objetos)
│   └── Desafio             (Desafio LivroService com separação de camadas)
├── ExerciciosMedia         (Exercícios de lógica e cálculos)
├── ExerciciosPOO           (Projetos aplicando conceitos de POO)
│   ├── Projeto_Escola      (Sistema de registro escolar)
│   └── SistemaBanco        (Gerenciamento de contas bancárias)
├── ExerciciosPOO2          (Sistemas avançados com foco em Clean Code)
│   ├── Faculdade           (Gestão acadêmica com alta coesão)
│   └── ProjetoLocadora     (Sistema de locação de filmes)
├── ExerciciosVetor         (Exercícios com foco em manipulação de vetores)
└── Lista                   (Coleção de exercícios clássicos de POO)
```

Essa estrutura modular permite que cada trabalho seja compilado e executado de forma independente, sem interferir nos demais.

---

## ✨ O que há de novo?

Adicionada uma nova coleção de exercícios no diretório `src/Lista`, focados na modelagem de sistemas do cotidiano utilizando Programação Orientada a Objetos. Os destaques incluem:

-   **Bomba de Combustível**: Gerenciamento de abastecimento, preços e controle de estoque de litros.
-   **Elevador**: Lógica de movimentação entre andares com validação de capacidade e peso.
-   **Login**: Sistema de autenticação robusto com validação de senha e bloqueio após exceder o limite de tentativas.
-   **Outros Exercícios**: Modelagem de **Conta Bancária**, **Contato**, **Dado**, **Estoque**, **Lâmpada**, **Playlist** e **Termômetro**, explorando conceitos de encapsulamento e estados de objeto.

---

## ⚙️ Como Compilar e Executar os Projetos

Para compilar e executar qualquer um dos projetos contidos neste repositório, siga o guia geral abaixo.

### Pré-requisitos

-   **Java Development Kit (JDK)**: Versão 17 ou superior.

### Guia Geral de Execução

1.  **Abra seu terminal** e navegue até a raiz do projeto `ExerciciosJava`.

2.  **Entre no diretório de código-fonte (`src`):**
    ```sh
    cd src
    ```

3.  **Compile o projeto desejado:**
    *Exemplo para o Desafio de Construtores:*
    ```sh
    javac ExerciciosConstrutor/Desafio/Main.java
    ```

4.  **Execute a classe principal:**
    ```sh
    java ExerciciosConstrutor.Desafio.Main
    ```
