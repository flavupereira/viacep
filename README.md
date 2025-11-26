# Buscador de Endereços por CEP
Um projeto Java que consulta endereços utilizando a API ViaCEP e exibe as informações de forma organizada.

## 📋 Descrição
Este projeto permite consultar informações de endereço a partir de um CEP fornecido pelo usuário, utilizando a API pública do ViaCEP. Os dados são convertidos de JSON para objetos Java e apresentados de forma legível.

## 🛠️ Tecnologias Utilizadas

- **Java 11+**

- **Gson** - Para manipulação de JSON

- **HTTP Client** - Para requisições HTTP

- **API ViaCEP** - Fonte dos dados de endereço

  ## 🚀 Como Usar
  
**1. Compile o projeto:**

```javac -cp .:gson-2.8.9.jar br/com/flavio/viacep/modelo/*.java```

**2. Execute o programa:**

bash
``` java -cp .:gson-2.8.9.jar br.com.flavio.viacep.modelo.BuscaViacep ```

**3. Digite o CEP:**


**Digite o Cep a ser consultado:**

01001000

**Veja o resultado:**


**Endereço:**

CEP: 01001-000

Logradouro: Praça da Sé

Complemento: lado ímpar

Bairro: Sé

Cidade: São Paulo

UF: SP

## 📦 Dependências

- Gson (versão 2.8.9 ou superior)

- Download: https://github.com/google/gson

## 🔧 Configuração

- Certifique-se de ter o Java JDK 11 ou superior instalado

- Baixe a biblioteca Gson e inclua no classpath

- Compile e execute o projeto conforme instruções acima

## ⚠️ Observações

- O projeto utiliza a API pública do ViaCEP

- O CEP deve ser informado sem traços ou espaços

- É necessária conexão com internet para funcionamento

- O programa trata erros de conexão e CEPs inválidos


  
