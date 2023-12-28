README.md
Projeto de Instanciação e Associação em Java
Este projeto em Java demonstra uma atividade simples de instanciar um trabalhador e estabelecer associações e composições entre classes, como contratos por hora e departamento.

Estrutura do Projeto e Relacionamentos
O projeto é composto pelas seguintes classes e seus relacionamentos:

Department: Representa um departamento no qual um trabalhador pode estar associado. Esta classe está associada à classe Worker.

HourContract: Representa um contrato por hora que contém informações como data, valor por hora e duração. Esta classe é uma composição na classe Worker.

Worker: Representa um trabalhador com informações básicas, uma lista de contratos por hora e um departamento ao qual está associado. Esta classe possui uma composição com a classe HourContract.

Enum WorkerLevel: Define os níveis de trabalhadores, como JUNIOR, PLENO e SENIOR.

Classes e suas Responsabilidades
1. Department
A classe Department contém informações básicas sobre um departamento, como nome, e está associada à classe Worker.

3. HourContract
A classe HourContract representa um contrato por hora com os seguintes atributos:
Data do contrato.

Valor por hora.
Duração em horas. Esta classe é uma composição dentro da classe Worker.
5. Worker
A classe Worker representa um trabalhador com os seguintes atributos:
Nome.
Nível (definido pela enum WorkerLevel).
Salário base.

Departamento ao qual está associado.
Uma lista de contratos por hora. Esta classe mantém uma composição com HourContract.


Funcionalidades
Instanciar um Trabalhador: Você pode criar uma instância de um trabalhador e associá-lo a um departamento, demonstrando o conceito de associação.
Adicionar Contratos por Hora: É possível adicionar contratos por hora à lista de contratos de um trabalhador, demonstrando o conceito de composição.
Calcular Salário: O projeto permite calcular o salário total de um trabalhador com base nos contratos por hora associados.

Como Executar
Para executar o projeto, você precisará ter uma IDE (Ambiente de Desenvolvimento Integrado) compatível com Java instalada em sua máquina. Siga os passos abaixo:
Abra o projeto em sua IDE de escolha.

Requisitos: Java Development Kit (JDK): Versão 8 ou superior. Bibliotecas Utilizadas: 
-java.util.Scanner: Para leitura de entrada do usuário.
-import java.util.List: Criação de uma Lista.
-import java.time.LocalDate: Captar e transformar datas.
-import java.util.Scanner: Entrada do usuário.
-import java.time.format.DateTimeFormatter: Formatar a Data.

Como Rodar o Projeto: Instale o JDK: Certifique-se de ter o JDK instalado em seu sistema e utilize SHIFT + F10.
