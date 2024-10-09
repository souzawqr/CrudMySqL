MySQL CRUD Project
Este projeto é um aplicativo Java simples que se conecta a um banco de dados MySQL e realiza operações básicas de CRUD (Create, Read, Update, Delete).


O projeto implementa as seguintes funcionalidades:

Create: Insere novos registros no banco de dados.
Read: Lê e exibe os registros do banco de dados.
Update: Atualiza registros existentes no banco de dados.
Delete: Remove registros do banco de dados.
Arquitetura
Este projeto está dividido em diferentes classes Java, cada uma responsável por uma operação específica:

ConnectionMySQL.java: Gerencia a conexão com o banco de dados MySQL.
Create.java: Contém o método para criar (inserir) novos registros no banco de dados.
Read.java: Responsável por ler e exibir dados armazenados no banco de dados.
Update.java: Atualiza registros existentes com base em identificadores.
Delete.java: Remove registros do banco de dados.
Pré-requisitos
Antes de rodar este projeto, você precisará ter o seguinte:

Java 8+
MySQL
Um banco de dados MySQL com as tabelas necessárias configuradas.
