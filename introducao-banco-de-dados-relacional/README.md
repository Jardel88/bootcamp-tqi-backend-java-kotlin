# Introdução aos Bancos de Dados Relacional

Um banco de dados relacional é um conjunto de informações que organiza dados em relações predefinidas, em que os dados são armazenados em uma ou mais tabelas (ou "relações") de colunas e linhas, facilitando a visualização e a compreensão de como as diferentes estruturas de dados se relacionam.

### Classificação dos Bancos de Dados

* Relacionais SQL
* Nao Relacionais NoSQL(Not Only SQL)
* Orientado a Objetos
* Hierarquico
* Redes

### SGBD

Um SGBD é um software cuja finalidade de gerenciar as informações de um banco de dados (também chamada de base de dados) segundo Navathe e Ramez (2005), e que também devem organizar, acessar, controlar e proteger as informações contidas no banco de dados.

O SGBD tem por objetivo facilitar a vida do programador ou analista, deixando livre para pensar na modelagem e não ficar pensando em questões técnicas de armazenamento de dados (sendo esta uma das
funções do SGBD).

### Características de um Banco de Dados Relaconal

* Relacionamento entre tabelas
* linguagem de consulta estruturada SQL
* Integridade referencial  
* Normalização de Dados
* segurança
* flexibilidade e extensibilidade
* suporte a transações ACID
  
**ACID** : Conjunto de propriedades de um Banco de Dados Relacional que garante que as operações sejam feitas de maneira segura em um banco d dados.

* A : Atomicidade -> A atomicidade garante que nenhuma ou a totalidade das
operações da transação sejam realizadas com sucesso.

* c : Consistencia -> A consistência preserva as regras impostas no banco de dados. Assim que a transação for finalizada, todos os dados devem estar íntegros.

* I : Isolamento -> O isolamento é a segurança de que uma transação não interfira no trabalho de outra. Somente após o término de uma transação, ela estará liberada para receber outras.

* D : Durabilidade -> A durabilidade é a certeza de que após uma transação ser realizada com sucesso, os resultados fiquem gravados no banco
de dados, mesmo se algum problema tenha ocorrido, como a
queda do sistema. A durabilidade ou persistência (como também é
conhecida) em um meio de armazenamento confiável e seguro é
um dos requisitos mais importantes de um Sistema Gerenciador de
Banco de Dados.
  
### Organização da SQL

* DQL : Linguagem de Consulta de Dados -> SELEC
* DML : Linguagem de Manipulação de Dados -> INSERT, UPDATE, DELETE
* DDL : Linguagem de Definição de Dados -> CREATE, ALTER, DROP
* DCL : Linguagem de Controle de Dados -> GRANT, REVOKE
* DTL : linguagem de transação de dados -> BEGIN, COMMIT, ROLLBACK
  
### Sintaxe básica da nomenclatura

* Os nomes devem começar com uma letra ou um caractere de sublinhado ( _ )
* Os nomes podem conter letras, numeros e caracteres de sublinhados ( _ )
* Sensibilidade a maiusculas e minusculas(Case sensitive)
  
### Modelagem de Banco de Dados

**DER** : Diagrama Entidade Relacionamento.

**MER** : Modelo de Entidade Relacionamento é representado através de diagramas, chamados de Diagramas Entidade Relacionamento(DER).

### Entidades

As entidades são nomeadas com substantivos concretos ou abstratos que representam de forma clara sua função dentro do dominio.

### atributos

São as características ou propriedades das entidades. Eles descrevem informações específicas sobre uma entidade.

### Relacionamentos

Relacionamentos representam a associação entre as entidades.

### Cardinalidade

* Relacionamento 1 .. 1 um-para-um
* Relacionamento 1 .. n ou 1 .. * um-para-muitos
* Relacionamento n .. n ou *..* muitos-para-muitos

### Tabelas

Ela é usada para armazenar dados de forma organizada. Cada tabela em um banco de dados tem um nome unico e é dividida em linhas e colunas.

### Colunas

Uma coluna é uma estrutura dentro de uma tabela que representa um atributo específico dos dados armazenados.

Cada coluna tem um nome unico e um tipo de dados associado que define o tipo de informação que pode ser armazenado nela, como numeros, textos, datas e etc.

### Registros

Um registro, também conhecido como linha ou tupla, é uma instância individual de dados em uma tabela.

### Tipos de Dados

Os dados podem variar muito entre os diversos SGBDs, os mais comuns sao:

* Inteiro(Integer)
* Decimal/Numerico(Decimal/Numeric)
* Caractere/Varchar(Character/Varchar)
* Data/Hora(Date/Time)
* Booleano(Boolean)
* Texto longo(Text)

### Chaves

#### Chave Primaria (PRIMARY KEY)

Identifica exclusivamente, não pode conter valores nulos(NULL), uma tabela pode conter apenas uma chave primaria.

#### Chave estrangeira (FOREIGN KEY)

Ela é usada para estabelecer e manter a integridade dos dados entre tabelas relacionadas.
Pode ser nula, é possivel ter mais de uma ou nenhuma em uma tabela.

### Normalização de Dados

A normalização de dados é um processo no qual se organiza e estrutura um banco de dados relacional de forma a eliminar redundancias e anomalias, garantindo a consistência e integridade dos Dados.

#### Formas normais

* 1FN : Estabelece que cada valor em uma tabela deve ser atômico, ou seja, indivisível, nenhum campo deve conter multiplos valores ou listas.

* 2FN : Estabelece que uma tabela deve estar na 1FN. Todos os atributos não chave devem depender totalmente da chave primaria.
  
Dica: Se sua tabela tem uma chave primaria simples não existe a possibilidade de termos dependencia parcial, e portanto ela já se encontra na f2.

* 3FN : Uma tabela deve estar na 2FN, nenhuma coluna não chave deve depender de outra coluna não chave.

### Consultas Avançadas

#### Consultas com junções e Subconsultas

##### Junções: JOINs

São usadas no SQL para combinar dados de duas ou mais tabelas relacionais em uma unica consulta.

##### Junções: Tipos

* INNER JOIN
* LEFT JOIN ou LEFT OUTER JOIN
* RIGHT JOIN ou RIGHT OUTER JOIN
* FULL JOIN ou FULL OUTER JOIN

##### INNER JOIN

Retorna apenas as linhas que tem correspondência em ambas as tabelas envolvidas na junção. A junção é feita com base em uma condição de igualdade especificada na cláusula ON.

##### LEFT JOIN

Retorna todas a linhas da tabela a esquerda da junção e as linhas correspondentes da tabela a direita. Se não houver correspondência, os valores da tabela a direita serão NULL.

##### RIGHT JOIN

Retorna todas as linhas da tabela a direita da junção e as linhas correspondentes da tabela a esquerda. Se não houver correspondência, os valores da tabela a esquerda serão NULL.

##### FULL JOIN

Retorna todas as linhas de ambas as tabelas envolvidas na junção, combinando-as com base em uma condição de igualdade. Se não houver correspondência, os valores serão preenchidos com NULL.

#### Sub Consultas(Consultas Aninhadas)

Elas permitem fazer consultas mais complexas, permitindo que você use o resultado de uma consulta como entrada para outra. sub Consultas podem ser usadas em varias partes de uma consulta.

#### Funções agregadas e agrupamento de resultados

##### Funções agregadas

* COUNT: Conta o numero de registros
* SUM: Soma os valores de uma coluna numerica
* AVG: Calcula a média dos valores de uma coluna numerica
* MIN: Retorna o valor mínimo de uma coluna
* MAX: Retorna o valor maximo de uma coluna
