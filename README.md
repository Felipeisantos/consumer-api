<h1 align="center">CONSUMER-API</h1>


# Objetivo do projeto
<p>O projeto tem como objetivo consumir a api do site https://openweathermap.org/ nele estão armazenados todos os dados meteorologicos do mundo inteiro, através da latitude e longitude da cidade/pais é possivel acessar os dados meteorologicos da região</p> 

## ✔️ Técnicas ferramentas e tecnologias utilizadas 

- ``Java 8``
- ``InteliJ IDEA``
- ``Insomnia``
- ``Paradigma de orientação a objetos``
- ``Design Pattern``

<p>Frameworks utilizados:</p>

### jpa: 
<p>framework utilizado para persistencia de objetos  </p>

### hibernate:
<p>framework utilizado para mapear os relacionamentos das entidades.</p>

### org.json: 
<p>framwork utilizado para trabalhar com json retornado nos requests feitos.</p>

### swagger-ui:
<p>framework de documentação onde ficam disponiveis todos os end-points da api</p>

### com.vladmihalcea: 
<p>framwork utilizado para tipos de dados objetivo dele na api é salvar tipo de dado jsonb no banco</p>

<h1 align="center"></h1>

### Configurando ambiente do projeto 

#### 1ª - Crie um banco de dados chamado workdbtest

 ```sql
 
 -- Database: workdbtest

-- DROP DATABASE IF EXISTS workdbtest;

CREATE DATABASE workdbtest
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
    
 ```
 
#### 2º Edite os campos de usuario se senha no arquivo: aplication.properties
 ```spring 
 
spring.datasource.username=postgres
spring.datasource.password=admin

```

#### 3º Não se preocupe com as tabelas, elas serão geradas automaticamente pela aplicação caso queira desabilitar é só alterar para none o parametro do ddl-auto

```
spring.jpa.hibernate.ddl-auto = none

```


<h1 align="center"></h1>
<h3>Existem 2 end-points principais usados na api </h3>

<p>Uma requisição POST que é passado como parametro Json o nome da cidade</p>
<p>/api/weatherforecast/</p>

```json
{
	"cityname":"campinas"
}
```

<p>Uma requisição GET que é passasdo via url o id da cidade que foi salvo no banco de dados</p>
<p>/api/weatherforecast/{id}</p>

<h1 align="center"></h1>
<br/>
<p>tambem é possivel acessar todo o historico de consultas através do end-point</p>
<p>/api/consulthistory</p>




