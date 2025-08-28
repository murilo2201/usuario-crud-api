# 📊 Sistema de Gerenciamento de Usuários - Java + Spring Boot 🚀

Bem-vindo ao projeto de sistema de gerenciamento de usuários com arquitetura REST API, documentação Swagger e integração com MySQL! Uma aplicação completa para operações CRUD de usuários. 🧠💻

## ✨ Sobre o Projeto
Este sistema oferece uma API RESTful completa para gerenciamento de usuários, com documentação interativa via Swagger e banco de dados MySQL para persistência de dados. Ideal para demonstração de habilidades backend e portfólio técnico! 🎯

## 💡 Funcionalidades
- 👤 **CRUD completo de usuários** (Create, Read, Update, Delete)
- 📚 **Documentação** da API com Swagger/OpenAPI
- 🗄️ **Integração com MySQL** para persistência de dados
- 🔧 **Configuração simplificada** para fácil execução
- 🚀 **API RESTful** com endpoints bem definidos
- ⚡ **Performance** com conexão HikariCP

## ⚙️ Tecnologias e Ferramentas
- **Java 17** ☕
- **Spring Boot 3.x** 🧩
- **Spring Web** 🌐
- **Spring Data JPA** 🗂️
- **MySQL Database** 🐬
- **Swagger / OpenAPI** 🧾
- **Maven** 📦
- **HikariCP** ⚡

## 🏗️ Estrutura do Projeto
```text
sistema-usuarios/
├── src/
│   └── main/
│       ├── java/
│       │   └── com.murilo.sistemas_usuarios/
│       │           ├── controller/
│       │           │   └── UserController.java
│       │           ├── model/
│       │           │   └── User.java
│       │           ├── repository/
│       │           │   └── UserRepository.java
│       │           ├── service/
│       │           │   └── UserService.java
│       │           └── config/
│       │               └── SwaggerConfig.java
│       └── resources/
│           └── application.properties
├── README.md
└── pom.xml
```

## 🏃 Como Rodar o Projeto

### Pré-requisitos
- **Java 17** ou superior
- **MySQL** instalado e rodando
- **Maven** instalado
- **Git** para clonar o repositório

### 📋 Passo a Passo Rápido

1. **Clone o repositório:**
```bash
git clone https://github.com/seu-usuario/sistema-usuarios.git
cd sistema-usuarios
```

2. **Configure o banco de dados:**
   - Abra o MySQL e execute (opcional):
```sql
CREATE DATABASE usuariocrudapidb;
```

3. **Edite o arquivo de configuração:**
   - Abra `src/main/resources/application.properties`
   - Modifique as linhas com **SUAS** credenciais MySQL:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/usuariocrudapidb?allowPublicKeyRetrieval=true&useSSL=false&createDatabaseIfNotExist=true
spring.datasource.username=SEUUSUARIOMYSQL
spring.datasource.password=SUASENHAMYSQL
```

4. **Execute a aplicação:**
```bash
# Com Maven
mvn spring-boot:run

# Ou compile e execute
mvn clean install
java -jar target/sistema-usuarios-0.0.1-SNAPSHOT.jar
```

5. **Acesse a documentação interativa:**
```text
http://localhost:8080/swagger-ui.html
```

## 🔧 Configuração do Application.properties
```properties
spring.application.name=sistema-usuarios

# MySQL Database
spring.datasource.url=jdbc:mysql://localhost:3306/usuariocrudapidb?allowPublicKeyRetrieval=true&useSSL=false&createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=suasenhaaqui

# JPA
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Desliga H2
spring.h2.console.enabled=false

# Swagger
springdoc.swagger-ui.path=/swagger-ui.html
springdoc.api-docs.path=/api-docs
```

## 🧪 Exemplos de Requisições

### ➕ Criar Usuário (POST /api/usuarios)
```bash
curl -X POST http://localhost:8080/api/usuarios \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "João Silva",
    "email": "joao@email.com",
    "senha": "senha123"
  }'
```

### 📋 Listar Usuários (GET /api/usuarios)
```bash
curl -X GET http://localhost:8080/api/usuarios
```

### ✏️ Atualizar Usuário (PUT /api/usuarios/{id})
```bash
curl -X PUT http://localhost:8080/api/usuarios/1 \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "João Silva Santos",
    "email": "joao.silva@email.com"
  }'
```

### 🗑️ Deletar Usuário (DELETE /api/usuarios/{id})
```bash
curl -X DELETE http://localhost:8080/api/usuarios/1
```

## 📊 Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/usuarios` | Lista todos os usuários |
| GET | `/api/usuarios/{id}` | Busca usuário por ID |
| POST | `/api/usuarios` | Cria novo usuário |
| PUT | `/api/usuarios/{id}` | Atualiza usuário |
| DELETE | `/api/usuarios/{id}` | Deleta usuário |

## ⚠️ Notas Importantes

- ✅ O banco será criado automaticamente (`createDatabaseIfNotExist=true`)
- ✅ SSL desabilitado para desenvolvimento (`useSSL=false`)
- ✅ Conexão segura habilitada (`allowPublicKeyRetrieval=true`)
- ✅ H2 Database desabilitado para uso exclusivo do MySQL
- ✅ As tabelas são criadas automaticamente pelo Hibernate (`ddl-auto=update`)

## 🚀 Para Recrutadores/Testadores

1. **Clone o projeto**
2. **Configure suas credenciais MySQL** no `application.properties`
3. **Execute** `mvn spring-boot:run`
4. **Acesse** `http://localhost:8080/swagger-ui.html`
5. **Teste os endpoints** diretamente pela interface Swagger!

## 🤝 Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para:
1. Fazer um fork do projeto
2. Criar uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abrir um Pull Request

## 📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor
**Seu Nome**  
- GitHub: [murilo2201](https://github.com/murilo2201)

- Email: murilofs.franca@gmail.com
