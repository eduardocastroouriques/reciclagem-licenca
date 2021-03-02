[![Build Status](/badges/develop/pipeline.svg)](/pipelines) 

# reciclagem

> Descrever objetivo do projeto.

## Referências

Projetos que dependem dos serviços desta API podem ser vistos na página [Stakeholders](/wikis/Stakeholders).
MRs neste projeto devem passar por aprovação de pelo menos um membro de cada equipe.

## Documentação

### API

Swagger: [http://localhost:8082/reciclagem/swagger-ui.html](http://localhost:8082/reciclagem/swagger-ui.html)

### Diagrama(s)

*  Diagrama do fluxo X: `POST /x`

![convite](Diagramas/post-x.png "Fluxo de X.")

## Execução

### Maven

Executando via Maven no ambiente local:

```sh
$ mvn clean package spring-boot:run
```

### Docker

Executando via Docker no ambiente local:

```sh
$ mvn clean package
$ cd target
$ docker build -t reciclagem .
$ docker run -d -p 8082:8082 --name reciclagem reciclagem
```

