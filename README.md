# java-api
ApiRest para inscrição de usuários e eventos 

# jAVA-API

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





