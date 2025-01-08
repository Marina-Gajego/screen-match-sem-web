# ScreenMatch - Aplicação de Séries Semelhante à Netflix 🍿

Este repositório contém o código do projeto **ScreenMatch**, uma aplicação de gerenciamento de séries, que utiliza a **OMDb API** para buscar informações sobre filmes e séries. 
O projeto foca no backend, utilizando **Java**, **Spring Framework**, **lambdas**, **streams**, **API's externas** e **manipulação de dados**.

## 📝 Funcionalidades

- **Consulta à OMDb API**: Utiliza a API externa OMDb para buscar informações sobre séries e filmes, como título, ano, atores, classificação e muito mais.
- **Manipulação de Dados**: Usa **Java Streams** para manipular e filtrar dados de forma eficiente.
- **Utilização de Lambdas**: Implementação de funções lambdas para tornar o código mais limpo e funcional.
- **Persistência de Dados**: Armazenamento de séries em listas e manipulação desses dados para diferentes operações, como ordenação e filtragem.
- **Gestão de Séries**: O sistema permite adicionar e visualizar séries favoritas, filtrando por gênero, ano ou nome.

## 🎯 Tecnologias e Conceitos Utilizados

- **Java**: Linguagem de programação principal para o backend.
- **Spring Framework**: Utilizado para configurar e gerenciar o backend da aplicação.
- **OMDb API**: API externa para buscar informações sobre filmes e séries.
- **Streams e Lambdas**: Para manipulação eficiente de coleções de dados.
- **JSON**: Manipulação de dados no formato JSON, especialmente para interagir com a OMDb API.
- **Git e GitHub**: Para controle de versão e colaboração no projeto.

## 🛠 Como Rodar o Projeto

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/seu-usuario/screen-match-sem-web.git
Instale Dependências: Certifique-se de que você tem o JDK 17 ou superior instalado.

Configure a OMDb API:

Registre-se na OMDb API para obter sua chave de API.
No projeto, configure a chave da API no arquivo de configuração ou diretamente no código, onde é feito o acesso à API.
Rodando a Aplicação: Abra o projeto em sua IDE favorita (IntelliJ, Eclipse, etc.) e execute a classe principal. O backend estará disponível para interações via comandos ou API RESTful (dependendo de como o projeto foi estruturado).

🚀 Funcionalidades da API
Buscar Séries: Consultar séries específicas pelo nome ou ano.
Adicionar Série à Lista: Adicionar uma série à lista de favoritas.
Filtrar Séries: Filtrar séries por ano, gênero ou nome usando streams.
Ordenar Séries: Ordenar séries por ano de lançamento ou classificação.

💡 Certificação
Este projeto foi realizado como parte dos cursos de Java na Alura, com foco no backend, usando o Spring Framework, API's externas e boas práticas de programação.

📝 Autora
Marina
Analista de Testes | Estudante de Java |
💡 "Utilize as boas práticas de Java, como lambdas e streams, para tornar seu código mais eficiente e fácil de manter."
