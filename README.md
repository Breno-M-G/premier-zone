# Premier Zone ⚽
Projeto back-end acadêmico desenvolvido para estudar e testar tecnologias modernas de desenvolvimento Java.

<p align="center" dir="auto" style="max-width:100%;">
    <img align="center" dir="auto" src="https://img.shields.io/badge/version-1.0-blue" width="85" style= "max-width: 100%;">
    <img align="center" dir="auto" src="https://img.shields.io/badge/license-MIT-green" width="89" style="max-width: 100%;">
    
</p>

**Objetivo principal:** Criar uma API REST simples que gerencia dados de uma "zona premier" (ex: times, jogadores, partidas, etc.), persistindo informações no PostgreSQL e importando dados iniciais a partir de arquivos CSV.

## Tecnologias utilizadas 💻

- [![Java](https://img.shields.io/badge/Java-25+-orange?style=flat-square&logo=java&logoColor=white)](https://www.java.com/)
- [![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-6DB33F?style=flat-square&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
- ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
- ![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

## Funcionalidades planejadas / implementadas

- [x] Estrutura inicial do projeto Spring Boot
- [x] Configuração do banco PostgreSQL (via docker-compose ou local)
- [x] Entidades JPA (ex: Time, Jogador, Partida, etc.)
- [x] Repositórios Spring Data JPA
- [x] Services e Controllers REST básicos (CRUD)
- [ ] Endpoint para importar dados de CSV para o banco
- [ ] Validações básicas e tratamento de erros

## Como rodar o projeto localmente

### Pré-requisitos

- Java 17+ instalado
- Maven 3.8+ instalado
- PostgreSQL rodando (ou use Docker)

### Passo a passo

1. Clone o repositório
   ```bash
   git clone https://github.com/Breno-M-G/premier-zone.git
   cd premier-zone

2. Configure o Banco
   Opção 1 - PostgreSQL local
   * Crie um bnco chamado ***premier_zone_db***
   * Altere o usuario e  senha no ***application.properties***
  
  Opção 2 - Docker 
  ```bash
docker run --name premier-postgres \
  -e POSTGRES_USER=escolhaSua \
  -e POSTGRES_PASSWORD=escolhaSua \
  -e POSTGRES_DB=premier_zone_db \
  -p 5432:5432 \
  -d postgres:15
  ```
3. Ajuste o arquivo ***src/main/resources/application.properties (ou use application.yml)***
   ```
    spring.datasource.url=jdbc:postgresql://localhost:5432/players
    spring.datasource.username=escolhaSua
    spring.datasource.password=escolhaSua
    spring.jpa.hibernate.ddl-auto=update   # ou validate / none
    spring.jpa.show-sql=true
    ```
4. Rode o projeto
```bash
mvn sprint-boot:run
```
## Estrutura de pastas
```
premier-zone/
├── src/
│   ├── main/
│   │   ├── java/com/example/premierzone/
│   │   │   ├── config/          ← configurações (security, etc.)
│   │   │   ├── controller/      ← endpoints REST
│   │   │   ├── dto/             ← objetos de transferência
│   │   │   ├── entity/          ← modelos JPA
│   │   │   ├── repository/      ← interfaces Spring Data
│   │   │   ├── service/         ← lógica de negócio
│   │   │   └── PremierZoneApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data/            ← seus arquivos .csv aqui (opcional)
│   └── test/
└── pom.xml
```
### Autor
Breno
Estudante / Desenvolvedor Java em aprendizado
Vila Velha, ES – Brasil
