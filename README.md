# Projeto de Demonstração - Padrão DAO com Java e JDBC

Este projeto é uma aplicação de console desenvolvida como parte do curso de Java do professor Nélio Alves. O objetivo principal é demonstrar a implementação do padrão de projeto **Data Access Object (DAO)** para realizar operações de CRUD (Create, Read, Update, Delete) em um banco de dados relacional, utilizando Java e JDBC.

## Conceitos Aplicados

-   **Padrão de Projeto DAO:** Separação da lógica de acesso a dados da lógica de negócios, resultando em um código mais organizado e de fácil manutenção.
-   **DAO Factory:** Utilização de uma fábrica para abstrair a criação das implementações do DAO, facilitando a troca da fonte de dados no futuro.
-   **Java Database Connectivity (JDBC):** Conexão e execução de consultas em um banco de dados.
-   **Gerenciamento de Recursos:** Tratamento correto de `Connection`, `Statement` e `ResultSet` para evitar vazamento de recursos.
-   **Mapeamento Objeto-Relacional (Básico):** Conversão de registros de tabelas do banco de dados em objetos Java.

## Tecnologias Utilizadas

-   **Java (JDK 21)**
-   **JDBC Driver** (Neste exemplo, foi utilizado o driver para MySQL, mas pode ser adaptado para qualquer banco de dados relacional).
-   **MySQL** (Como sistema de gerenciamento de banco de dados).

## Como Executar o Projeto

Siga os passos abaixo para configurar e executar a aplicação em seu ambiente local.

### 1. Pré-requisitos

-   Java JDK 21 ou superior instalado.
-   Um servidor de banco de dados MySQL (ou outro de sua preferência) em execução.
-   Uma IDE Java, como IntelliJ IDEA ou Eclipse.

### 2. Configuração do Banco de Dados

-   Crie um schema/banco de dados em seu servidor MySQL (ex: `curso_java_jdbc`).
-   Execute o script SQL disponível em `database.sql` para criar as tabelas `department` e `seller` e popular com dados iniciais.

### 3. Configuração da Conexão

-   Na raiz do projeto, renomeie o arquivo `db.properties.example` para `db.properties`.
-   Abra o arquivo `db.properties` e altere os valores de `dburl`, `user` e `password` de acordo com as configurações do seu banco de dados.

    ```properties
    dburl=jdbc:mysql://localhost:3306/curso_java_jdbc
    user=seu_usuario
    password=sua_senha
    ```

### 4. Execução

-   Importe o projeto na sua IDE.
-   Execute a classe principal `application.Program` e `application.Program2` para ver os testes das operações de CRUD sendo executados no console.
-   Faça as alterações necessárias nas classes principais para realizar seus próprios testes.
