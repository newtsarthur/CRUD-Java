Aqui está um exemplo de **README** para sua aplicação **CRUD Java** com Spring Boot:

---

# CRUD Java - Spring Boot Application

Este é um projeto simples de CRUD (Create, Read, Update, Delete) desenvolvido com **Spring Boot**. O objetivo deste projeto é fornecer uma implementação básica de um sistema de gerenciamento de usuários utilizando **JPA**, **MySQL** e **Validação** de entrada.

## Tecnologias Utilizadas

- **Spring Boot 3.x**: Framework principal para desenvolvimento do back-end.
- **Spring Data JPA**: Para interação com o banco de dados usando JPA.
- **MySQL**: Banco de dados relacional para armazenar os dados.
- **Lombok**: Para simplificar o código (geração de getters, setters, e construtores).
- **Flyway**: Para migração de banco de dados.
- **Spring Boot DevTools**: Para uma experiência de desenvolvimento mais ágil.

## Pré-Requisitos

Antes de executar a aplicação, você precisará de:

- **Java 17** ou superior
- **Maven 3.x** ou superior
- **MySQL** configurado e rodando localmente ou em um servidor.

## Configuração do Banco de Dados

### Banco de Dados MySQL

Certifique-se de que você tem um banco de dados MySQL rodando. Aqui está um exemplo de como criar o banco de dados:

```sql
CREATE DATABASE crud_java;
```

## Configuração do Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/crud-java.git
   cd crud-java
   ```

2. Edite o arquivo `src/main/resources/application.properties` com as informações do seu banco de dados MySQL:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/crud_java
   spring.datasource.username=root
   spring.datasource.password=root
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   ```

3. Se necessário, configure o Flyway para executar migrações no banco de dados.

## Executando a Aplicação

1. Para compilar e rodar a aplicação, execute o seguinte comando:

   ```bash
   mvn spring-boot:run
   ```

2. A aplicação estará disponível em `http://localhost:8080`.

## Endpoints da API

A aplicação expõe os seguintes endpoints para manipulação de dados de usuários:

### 1. Criar Usuário (POST)

Cria um novo usuário com nome, email e senha.

- **URL**: `/api/usuarios`
- **Método**: `POST`
- **Corpo** (JSON):

  ```json
  {
    "nome": "Nome do Usuário",
    "email": "usuario@exemplo.com",
    "senha": "senha123"
  }
  ```

- **Resposta** (JSON):

  ```json
  {
    "id": 1,
    "nome": "Nome do Usuário",
    "email": "usuario@exemplo.com",
    "senha": "senha123"
  }
  ```

### 2. Obter Todos os Usuários (GET)

Obtém todos os usuários cadastrados no sistema.

- **URL**: `/api/usuarios`
- **Método**: `GET`

- **Resposta** (JSON):

  ```json
  [
    {
      "id": 1,
      "nome": "Nome do Usuário",
      "email": "usuario@exemplo.com",
      "senha": "senha123"
    }
  ]
  ```

### 3. Obter Usuário por ID (GET)

Obtém os dados de um usuário específico pelo ID.

- **URL**: `/api/usuarios/{id}`
- **Método**: `GET`

- **Resposta** (JSON):

  ```json
  {
    "id": 1,
    "nome": "Nome do Usuário",
    "email": "usuario@exemplo.com",
    "senha": "senha123"
  }
  ```

### 4. Atualizar Usuário (PUT)

Atualiza os dados de um usuário existente.

- **URL**: `/api/usuarios/{id}`
- **Método**: `PUT`
- **Corpo** (JSON):

  ```json
  {
    "nome": "Novo Nome",
    "email": "novo@exemplo.com",
    "senha": "novaSenha123"
  }
  ```

- **Resposta** (JSON):

  ```json
  {
    "id": 1,
    "nome": "Novo Nome",
    "email": "novo@exemplo.com",
    "senha": "novaSenha123"
  }
  ```

### 5. Excluir Usuário (DELETE)

Deleta um usuário pelo ID.

- **URL**: `/api/usuarios/{id}`
- **Método**: `DELETE`

- **Resposta**: `204 No Content` (sem corpo)

## Validações

A aplicação valida os campos `nome`, `email` e `senha` antes de salvar no banco de dados:

- O **nome** deve ter entre 2 e 100 caracteres.
- O **email** deve ser válido.
- A **senha** deve ter no mínimo 6 caracteres.

## Testes

Para rodar os testes da aplicação, use o comando:

```bash
mvn test
```

## Contribuindo

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nome-da-feature`).
3. Faça o commit das suas alterações (`git commit -am 'Adicionando nova feature'`).
4. Push para a branch (`git push origin feature/nome-da-feature`).
5. Abra um Pull Request.

## Licença

Distribuído sob a licença MIT. Veja a licença para mais informações.

---

Esse é um **README** básico para o seu projeto. Você pode personalizá-lo conforme necessário para refletir mais detalhes sobre sua aplicação.