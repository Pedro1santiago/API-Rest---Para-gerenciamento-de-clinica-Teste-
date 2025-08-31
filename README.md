# 🩺 CRUD de Médicos - Spring Boot

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java)](https://www.oracle.com/java/)  
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.5-brightgreen?logo=spring)](https://spring.io/projects/spring-boot)  
[![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?logo=mysql)](https://www.mysql.com/)  
[![Lombok](https://img.shields.io/badge/Lombok-1.18.34-orange?logo=lombok)](https://projectlombok.org/)  

---

## ✨ Sobre o Projeto
Um **CRUD de Médicos** desenvolvido com **Spring Boot**, utilizando:

- JPA/Hibernate para persistência
- Flyway para versionamento de banco
- Validação de dados com Jakarta Validation
- DTOs para separar dados da entidade
- Soft delete de registros
- Paginação de resultados

---

## 🚀 Funcionalidades

- 📝 Cadastro de médicos  
- 🔄 Atualização de médicos  
- 📋 Listagem paginada  
- ❌ Exclusão com soft delete  
- 🏥 Gestão de endereço via Embedded  
- 🛠️ Validação automática de campos  
- 🗂️ Migrations versionadas com Flyway  

---

## 🗂️ Estrutura do Projeto

<details>
<summary>Clique para expandir</summary>

## 🗂️ Estrutura do Projeto

| Caminho                     | Descrição                          |
|------------------------------|------------------------------------|
| `src/main/java`              | Código-fonte Java                  |
| ├─ `com.pedrosantiago.api`  | Pacote base                        |
| │  ├─ `controller`          | REST controllers                   |
| │  ├─ `medico`              | Entidade, DTOs, Repository         |
| │  └─ `endereco`            | Classe embutida de endereço        |
| └─ `resources`              | Recursos do projeto                |
|    ├─ `application.properties` | Configurações do Spring Boot     |
|    └─ `db/migration`        | Scripts Flyway (migrations SQL)    |

</details>

---

⚙️ **Endpoints**

| Método | Endpoint        | Descrição                      |
|--------|----------------|--------------------------------|
| POST   | /medicos       | Cadastra um novo médico        |
| GET    | /medicos       | Lista médicos (paginado)       |
| PUT    | /medicos       | Atualiza informações de um médico |
| DELETE | /medicos/{id}  | Remove um médico (soft delete) |

---


📝 Configuração do Banco


-No application.properties:

properties

spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_api

spring.datasource.username=root

spring.datasource.password=senha

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

---

⚠️ Lembre-se de criar o banco antes de rodar o projeto:

---

-SQL

create database vollmed_api;

---

💡 Dicas


-Garanta que o Lombok está instalado e o annotation processing ativado no IntelliJ.

-Ordene corretamente suas migrations do Flyway (V1__, V2__, V3__).

-Use DTOs para separar dados da entidade e manter a API limpa.

-Teste os endpoints com Postman ou Insomnia.

---
## 📬 Contato 
- **Email:** pedro.santigosiqueira@gmail.com
- **LinkedIn:** [Pedro Santiago](www.linkedin.com/in/pedro-santiago-838300277)
- **GitHub:** [pedrosantiago](https://github.com/Pedro1santiago)
