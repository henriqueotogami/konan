<div align="center">

# Estudos de Spring Boot

<img width="auto" src="https://github.com/henriqueotogami/konan/blob/main/konan.png?raw=true">

<br>
<br>
<div align="center">
<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/henriqueotogami/konan">
</div>
<br>
<img src="https://img.shields.io/github/issues/henriqueotogami/konan">
<img src="https://img.shields.io/github/forks/henriqueotogami/konan">
<img src="https://img.shields.io/github/stars/henriqueotogami/konan">
<img src="https://img.shields.io/github/license/henriqueotogami/konan">
</div>
<br>
<div align=center>
<a href="https://wakatime.com/badge/user/1e53636e-c916-4d50-9ce1-f3ac75a883e3/project/b5eb52f6-55bb-4206-a893-752217347e99"><img src="https://wakatime.com/badge/user/1e53636e-c916-4d50-9ce1-f3ac75a883e3/project/b5eb52f6-55bb-4206-a893-752217347e99.svg" alt="wakatime"></a>
</div>
<br>
<hr>

> Repositório com exercícios e códigos desenvolvidos durante o estudo de Spring Boot, contendo APIs REST, persistência de dados com JPA e exemplos de manipulação de requisições HTTP.

## 📋 Sobre o Projeto

Este projeto contém uma aplicação Spring Boot desenvolvida como parte do curso [Cod3r | Java 2022 Completo](https://www.udemy.com/course/fundamentos-de-programacao-com-java/). Os códigos incluem exemplos práticos de APIs REST, CRUD de produtos com persistência em MySQL, manipulação de diferentes verbos HTTP, calculadora via endpoints e gerenciamento de clientes com parâmetros de URL.

## 📁 Estrutura do Projeto

### Controllers (`src/main/java/br/com/otogamidev/konan/controller/`)
- **ProductManager** - CRUD completo de produtos com endpoints REST (listar, buscar por ID, criar/atualizar, deletar, buscar por nome)
- **ClientManager** - Endpoints de clientes demonstrando `@PathVariable` e `@RequestParam`
- **CalculatorManager** - Calculadora via API com operações de adição e subtração
- **HttpManager** - Demonstração dos métodos HTTP (GET, POST, PUT, PATCH, DELETE)

### Entidades (`src/main/java/br/com/otogamidev/konan/model/entities/`)
- **Product** - Entidade de produto com id, nome, preço e desconto (validações com Bean Validation)
- **Client** - Entidade de cliente com id, nome e CPF

### Repositórios (`src/main/java/br/com/otogamidev/konan/model/repositories/`)
- **DataAccessProduct** - Interface JPA para persistência de produtos com busca por nome

### Recursos Estáticos (`src/main/resources/`)
- **form-page.html** - Página HTML para teste de requisições POST
- **application.properties** - Configuração do banco de dados MySQL e JPA

## 📂 Estrutura do repositório

```
LICENSE
README.md
pom.xml
konan.png
src/
├── main/
│   ├── java/br/com/otogamidev/konan/
│   │   ├── KonanApplication.java          # Classe principal Spring Boot
│   │   ├── controller/
│   │   │   ├── ProductManager.java        # API REST de produtos
│   │   │   ├── ClientManager.java         # API REST de clientes
│   │   │   ├── CalculatorManager.java     # API de calculadora
│   │   │   └── HttpManager.java           # Demonstração métodos HTTP
│   │   └── model/
│   │       ├── entities/
│   │       │   ├── Product.java           # Entidade Produto
│   │       │   └── Client.java            # Entidade Cliente
│   │       └── repositories/
│   │           └── DataAccessProduct.java # Repositório JPA
│   └── resources/
│       ├── application.properties         # Configurações da aplicação
│       └── static/
│           └── form-page.html             # Página de teste
└── test/
    └── java/br/com/otogamidev/konan/
        └── TestKonanApplication.java      # Teste da aplicação
```

## 🛠️ Tecnologias Utilizadas

- **Java 17** - Linguagem de programação
- **Spring Boot 3.0** - Framework para aplicações Java
- **Spring Web** - API REST e endpoints HTTP
- **Spring Data JPA** - Persistência de dados com Hibernate
- **Spring Validation** - Validação de beans (Bean Validation)
- **MySQL** - Banco de dados relacional
- **Maven** - Gerenciamento de dependências e build

## 📝 Funcionalidades Principais

### CRUD de Produtos (`/api/products`)
- **GET** `/api/products` - Lista todos os produtos
- **GET** `/api/products/{id}` - Busca produto por ID
- **GET** `/api/products/name/{contains}` - Busca produtos por nome
- **POST** `/api/products` - Cria novo produto
- **PUT** `/api/products` - Atualiza produto existente
- **DELETE** `/api/products/{id}` - Remove produto

### Clientes (`/clients`)
- **GET** `/clients` - Cliente por parâmetro `?id=`
- **GET** `/clients/{id}` - Cliente por ID na URL
- **GET** `/clients/whatever` - Retorna cliente de exemplo

### Calculadora (`/calculator`)
- **GET** `/calculator/add/{firstNumber}/{secondNumber}` - Soma
- **GET** `/calculator/subtract?firstNumber=&secondNumber=` - Subtração

### Métodos HTTP (`/methods`)
- **GET**, **POST**, **PUT**, **PATCH**, **DELETE** - Demonstração de cada verbo

## 🚀 Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.6+
- MySQL em execução (porta 3306)

### Configuração do Banco de Dados
1. Crie o banco de dados no MySQL:
```sql
CREATE DATABASE konan;
```

2. Configure as credenciais em `src/main/resources/application.properties`:
```properties
spring.datasource.username=root
spring.datasource.password=sua_senha
```

### Executando a Aplicação

```bash
# Clonar o repositório
git clone https://github.com/henriqueotogami/konan.git
cd konan

# Executar com Maven
./mvnw spring-boot:run

# Ou compilar e executar o JAR
./mvnw clean package
java -jar target/konan-0.0.1-SNAPSHOT.jar
```

A aplicação estará disponível em: **http://localhost:8080**

## 📚 Conteúdos Abordados

- ✅ Configuração de projeto Spring Boot
- ✅ Criação de APIs REST com `@RestController`
- ✅ Mapeamento de URLs com `@RequestMapping`, `@GetMapping`, etc.
- ✅ Parâmetros de requisição (`@PathVariable`, `@RequestParam`)
- ✅ Persistência com Spring Data JPA e MySQL
- ✅ Validação de dados com Bean Validation
- ✅ Entidades e repositórios JPA
- ✅ Diferentes verbos HTTP (GET, POST, PUT, PATCH, DELETE)

## ⚙️ Como Funciona

### Fluxo da API de Produtos
1. O `ProductManager` expõe endpoints REST em `/api/products`
2. Requisições são recebidas e processadas pelo Spring MVC
3. O `DataAccessProduct` (CrudRepository) persiste no MySQL via JPA
4. A entidade `Product` possui validações: nome obrigatório, preço ≥ 0, desconto entre 0 e 1
5. A busca por nome usa `findByNameContainsIgnoreCase` (case insensitive)

### Configuração JPA
- `spring.jpa.hibernate.ddl-auto=update` - Schema atualizado automaticamente
- Banco `konan` - Certifique-se de criá-lo antes de executar

## Ambiente de Desenvolvimento

### Sistema Operacional
MacOS Monterey - Versão 12.6

### IDE
IntelliJ IDEA Community Edition 2022.2

#### Plugins recomendados
- [Atom Material Icons](https://plugins.jetbrains.com/plugin/10044-atom-material-icons)
- [Codota AI Autocomplete for Java](https://plugins.jetbrains.com/plugin/7638-codota-ai-autocomplete-for-java-and-javascript)
- [GitToolBox](https://plugins.jetbrains.com/plugin/7499-gittoolbox)
- [Nyan Progress Bar](https://plugins.jetbrains.com/plugin/8575-nyan-progress-bar)
- [Rainbow Brackets](https://plugins.jetbrains.com/plugin/10080-rainbow-brackets)
- [Wakatime](https://wakatime.com)
- [Xcode-Dark Theme](https://plugins.jetbrains.com/plugin/13106-xcode-dark-theme)

## 📄 Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 📖 Referências

- [Cod3r | Java 2022 Completo](https://www.udemy.com/course/fundamentos-de-programacao-com-java/) - Curso de referência
- [Documentação Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)

## Contribuições

> ### Caso você queira ajudar a melhorar este repositório, qualquer ajuda é bem-vinda.

- [x] Faça um **fork** deste repositório (https://github.com/henriqueotogami/konan/fork)
- [x] Crie um **branch** para adicionar as suas modificações `git checkout -b meu-novo-recurso`
- [x] Faça um **commit** `git commit -am 'feature: Adicionando um novo recurso ...'`
- [x] Faça um **push** `git push origin meu-novo-recurso`
- [x] Crie uma nova **pull request** neste repositório

**Depois que sua solicitação (pull request) for aceita e adicionada (merged) ao ramo principal (branch main), você pode excluir sua branch tranquilamente.**

---

### Hashtags
#SpringBoot #Java #RESTAPI #JPA #MySQL #Maven #Backend #WebDevelopment #OpenSource #GitHub #CodeExamples #LearningJava

### Meta Keywords
```
Spring Boot, Java, API REST, JPA, MySQL, Maven, CRUD, backend,
persistência de dados, Bean Validation, Spring Data, demonstração HTTP,
aprender Spring, código exemplo, Henrique Matheus, otogamidev
```

<div align="center">

<br>

> ### **Muito obrigado, e que a Força esteja com você.**
>
> ### Desenvolvido por **HMAP | Henrique Matheus Alves Pereira** 🦁

</div>
