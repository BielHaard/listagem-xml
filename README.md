# Projeto XML com Spring Boot e Java 17

Este é um projeto básico em Spring Boot que demonstra a criação de dois endpoints para listar recibos em diferentes formatos: JSON e XML.

## Pré-requisitos

- Java 17
- Maven 3.x
- IDE de sua preferência (recomendado: IntelliJ IDEA, Eclipse)

## Configuração do Ambiente

1. **Clonar o repositório:**
   ```bash
   git clone [https://seu-repositorio.git](https://github.com/BielHaard/xml
   cd xml
   mvn spring-boot:run

## Isso iniciará a aplicação Spring Boot. Os endpoints estarão disponíveis em:

- http://localhost:8080/api/recibos/json
- http://localhost:8080/api/recibos/xml

## Endpoints
- /api/recibos/json
- Retorna a lista de recibos em formato JSON.

- Exemplo de resposta:

[
  {
    "id": 1,
    "empresa": {
      "nome": "Telecom XYZ Ltda",
      "cnpj": "12.345.678/0001-90",
      "endereco": {
        "rua": "Avenida Principal, 123",
        "cidade": "São Paulo",
        "estado": "SP",
        "cep": "01000-000"
      }
    },
    "cliente": {
      "nome": "João da Silva",
      "cpf": "123.456.789-00",
      "endereco": {
        "rua": "Rua Secundária, 456",
        "cidade": "São Paulo",
        "estado": "SP",
        "cep": "02000-000"
      }
    },
    "totalRecebido": 100.0
  }
]


- /api/recibos/xml
- Retorna a lista de recibos em formato XML.

- Exemplo de resposta:

<recibos>
  <recibo>
    <id>1</id>
    <empresa>
      <nome>Telecom XYZ Ltda</nome>
      <cnpj>12.345.678/0001-90</cnpj>
      <endereco>
        <rua>Avenida Principal, 123</rua>
        <cidade>São Paulo</cidade>
        <estado>SP</estado>
        <cep>01000-000</cep>
      </endereco>
    </empresa>
    <cliente>
      <nome>João da Silva</nome>
      <cpf>123.456.789-00</cpf>
      <endereco>
        <rua>Rua Secundária, 456</rua>
        <cidade>São Paulo</cidade>
        <estado>SP</estado>
        <cep>02000-000</cep>
      </endereco>
    </cliente>
    <totalRecebido>100.0</totalRecebido>
  </recibo>
</recibos>

