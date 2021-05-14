# java-api
ApiRest para inscrição de usuários e eventos 


O projeto consiste em uma apirestful de um sistema de cadastro de Eventos e Usuarios 

## 🚀 Começando

Para reproduzir a api bastar importar o projeto em uma IDE ou ambiente de desenvolvimento spring que contenha o java 11 ou realizando os seguintes comando com dockerfile. 
Na raiz do projeto com docker ativado digite os comandos. 

Api também disponível no docker-hub : 

https://hub.docker.com/r/jgjaum/java-api

-docker build -t java-api . 

em seguida para apos buildar o projeto para rodar digite: 

-docker run -p 8080:8080 java-api 

### 📋 Pré-requisitos

-Docker

-SpringMVC

-H2
  

#### Exemplo de requisição da api 

Após realizar todos os procedimentos descritos vá no postman ou outro software para consumir api e realize o no metodo http post  a seguinte requisão com o json:

para listar os eventos 
http://localhost:8080/api/eventos/listar  -- para listar os eventos 

http://localhost:8080/api/eventos --para cadastros dos eventos 
       
 
 {
    "id":1,
    "nome":"nome_do_evento"
    "vagas": "numero_de_vaga "
    

}

para listar os Usuarios
http://localhost:8080/api/usuario/listar  -- para listar os usuarios

http://localhost:8080/api/usuario --para cadastros dos usuarios
    
 
   {
    "id":1,
    "nome":"nome_do_usuario" 

}

### Banco de dados
O banco de dados usado nesta API é o [H2 Database Engine](https://www.h2database.com/), usado aqui como banco de dados _in-memory_.
Este banco possui um conveniente console que pode ser acessado por este link:
http://localhost:8080/h2

Para se efetuar login nesse banco mude o valor de _JDBC URL_ para _jdbc:h2:mem:cadastro-eventos_ 

### Documentação da API
Esse projeto usa o [Swagger](https://swagger.io/) para documentação da API. 
Para acessa-lá, click no seguinte link quando o projeto estiver em execução: 
http://localhost:8080/swagger-ui.html

### Referências
1. [Documenting a Spring REST API Using OpenAPI 3.0](https://www.baeldung.com/spring-rest-openapi-documentation)
1. [Quick Guide on Loading Initial Data with Spring Boot](https://www.baeldung.com/spring-boot-data-sql-and-schema-sql)
1. [Spring Boot and H2 in memory database - Why, What and How?](https://www.springboottutorial.com/spring-boot-and-h2-in-memory-database)