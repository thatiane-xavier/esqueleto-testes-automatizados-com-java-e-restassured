# Esqueleto de automação de API com Java e RestAssured

Este projeto contém uma estrutura básica de exemplo de testes automatizados de API utilizando Java e RestAssured.

## Configuração Inicial

Certifique-se de que as seguintes ferramentas estejam instaladas em seu ambiente:

- Java JDK 17
- Maven 3.6 ou superior

## Estrutura do Projeto

O projeto segue a seguinte estrutura de diretórios:

- `src/test/java` - Contém as classes de modelo, de requisição e de dados utilizadas nos testes, além das classes de teste que realizam as verificações nas respostas da API.

### Classes de Modelo

As classes de modelo representam as estruturas de dados utilizadas pela API:

- `UserModel.java` - Modelo de dados de um login de usuário.

### Classes de Dados

Classes que fornecem dados para os testes:

- `UserData.java` - Fornece dados válidos e inválidos para o login de usuários.

### Classes de Requisição

Classes que encapsulam as requisições HTTP à API utilizando RestAssured:

- `UserRequest.java`

### Classes de Teste

Classes que contêm os testes a serem executados:

- `UserTest.java`

### A estratégia de testes deve incluir:

* Testes positivos para verificar o comportamento esperado da API.
* Testes negativos para garantir a robustez e tratamento adequado de erros.
* Testes de integração para validar o correto funcionamento das rotas em conjunto.

## Executando os Testes

Para executar todos os testes, utilize o seguinte comando:

~~~
mvn clean test
~~~

Para executar uma classe de teste específica:

~~~
mvn clean test -Dtest=NomeDaClasseDeTeste
~~~


