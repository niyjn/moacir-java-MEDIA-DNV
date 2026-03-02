# Repositório de Trabalhos da Faculdade em Java

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Este repositório serve como um arquivo central para os diversos trabalhos e exercícios de programação desenvolvidos na linguagem Java durante o período da faculdade. O objetivo é documentar e organizar os projetos, que abrangem desde conceitos básicos de lógica de programação até aplicações mais estruturadas utilizando Programação Orientada a Objetos (POO).

---

## 📂 Estrutura do Repositório

O código-fonte de todos os projetos está localizado no diretório `src/`. Para manter a organização e o isolamento entre os trabalhos, cada subdiretório dentro de `src/` representa um projeto ou um conjunto de exercícios independentes.

```
C:.
└───src
    ├───ExerciciosMedia         (Exercícios de lógica e cálculos)
    ├───ExerciciosPOO           (Projetos aplicando conceitos de POO)
    ├───ExerciciosVetor         (Exercícios com foco em manipulação de vetores)
    └───Projeto_Escola          (Sistema CLI para gerenciamento escolar)
```

Essa estrutura modular permite que cada trabalho seja compilado e executado de forma independente, sem interferir nos demais.

---

## ⚙️ Como Compilar e Executar os Projetos

Para compilar e executar qualquer um dos projetos contidos neste repositório, siga o guia geral abaixo.

### Pré-requisitos

-   **Java Development Kit (JDK)**: Versão 17 ou superior. Para verificar se você possui o Java instalado, utilize o comando `java -version`.

### Guia Geral de Execução

1.  **Abra seu terminal** e navegue até a raiz do projeto `ExerciciosJava`.

2.  **Entre no diretório de código-fonte (`src`):**
    ```sh
    cd src
    ```

3.  **Compile o projeto desejado:**
    Use o comando `javac`, especificando o nome do pacote (que corresponde ao nome do diretório do projeto) e os arquivos Java que deseja compilar.

    *Exemplo para compilar todos os arquivos do `Projeto_Escola`:*
    ```sh
    javac Projeto_Escola/*.java
    ```

4.  **Execute a classe principal:**
    Após a compilação, use o comando `java` com o nome completo da classe principal (formato: `NomeDoPacote.NomeDaClasse`).

    *Exemplo para executar o `Projeto_Escola`:*
    ```sh
    java Projeto_Escola.Main
    ```

> **Nota:** O nome da classe principal (aquela que contém o método `public static void main(String[] args)`) pode variar entre os projetos. Verifique o código-fonte do projeto que você deseja executar para encontrá-la.

---
