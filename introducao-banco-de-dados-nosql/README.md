# Introdução

### Termo correto: NOT Onli SQL

Não seguem modelo de tabelas e relacionamentos. Projetado para lidar com alto volume de dados, alta escalabilidade.
Alta flexibilidade na estrutura de dados. Eles são amplamente utilizados em cenários onde a consistencia imediata de dados não é critica.

### Diferenças

| SQL                               | NoSQL                                     |
| :---:                             | :---:                                     |
| Modelos de Dados fixo             | Modelo de Dados flexível                  |
| Escalabilidade de Dados vertical  | Escalabilidade horizontal                 |
| Transações ACID 100%              | Transações ACID ausentes total ou parcial |
| Linguagem de consulta SQL         | Cada SGBD tem sua própria                 |

### Vantagens dos Bancos de Dados não Relacionais

* Flexibilidade na modelagem
* Alta escalabilidade
* Melhor desempenho em cenários de consulta intensiva
* Tolerância a falhas

### Desvantagens dos bancos de dados não relacionais

* Menor consistência de Dados imediatas
* Menor suporte a consultas complexas ** depende do SGBD

### Visão geral dos tipos de NoSQL

#### Tipos

* Key-value
* Documento
* Coluna
* Grafos
* Entre outros...

### Key-Value > Chave Valor

Armazena Dados como pares de chave e valor, onde cada chave é um identificador único para acessar o valor correspondente.
Exemplo de SGBD: Redis, Riak, Amazon DynamoDB.

Uso: Um site pode usar um banco de dados Redis para armazenar informações de sessão de usuario

### Document > Documento

Armazenam Dados em documentos semiestruturados, geralmente em forma de JSON ou BSON 

Exemplo de SGBD: MongoDB, Couchbase, Apache Couch.

Uso: Um catálogo de e-commerce, pode utilizar o MongoDB para armazenar informações de produtos, como nome, descrição, preço e atributos adicionais.

### Coluna

Armazenam Dados em formato de colunas, o que permite alta escalabilidade e eficiência em determinados tipos de consultas.

Exemplos de SGBD: Apache Cassandra, ScyllaDB, HBase

Uso: Um sistema de registro de aplicativos pode usar o Apache Cassandra para armazenar registro de Logs.

### Grafo

Armazenar e consultar Dados interconectados, onde os relacionamentos entre os dados são tão importantes quanto os próprios Dados.

Exemplo de SGBD: Neo4j, Amazon Neptune, JanusGrafh.

Uso: Uma rede social pode usar o Neo4j para armazenar os perfis dos usuários e suas conexões, permitindo consultas eficientes para encontrar amigos em comum.

## Introdução ao MongoDB

O que é o MongoDB.

Banco de Dados NoSQL orientado a documentos, grande volume de Dados, escalabilidade horizontal e modelagem flexível.

Não exige um esquema, permite que os documentos sejam armazenados em formato BSON(Binary JSON), proporcionando uma estrutura semiestruturada.

### Vantagens

* Flexibilidade na modelagem de Dados
* Escalabilidade horizontal para lidar com grandes volumes de Dados
* Consultas ricas e suporte a consultas complexas
* Alta disponibilidade e tolerância a falhas
* Comunidade ativa e recursos de suporte

### Desvantagens

* Menor consistência imediata em comparação aos Bancos de Dados Relacionais
* Consultas mais complexas podem exigir um maior conhecimento e planejamento adequado
* Maior consumo de espaço de armazenamento em comparação com Banco de Dados Relacionais devido a flexibilidade dos documentos

#### Onde o MongoDB é usado

Aplicações WEB: Onde a flexibilidade e a escalabilidade são cruciais para lidar com volumes variáveis de Dados.

Análise de Big Data: Análise de grandes volumes de Dados não estruturados ou semiestruturados oferecendo uma plataforma para armazenar e processar esses Dados.

Armazenamento de Dados semiestruturados: Permite a inserção de documentos com estruturas diferentes em uma mesma coleção.

Casos de uso de geolocalização: Com suas funcionalidades de consultas geoespacial, é adequado para casos de uso que envolvem dados baseados em localização, como aplicativos de mapeamento e rastreamento.

#### Relacionamentos no MongoDB

O MongoDB não implementa integridade referencial e nem operações de junção.

Logo, não existe o conceito de chave estrangeira para documentos.

Existem duas maneiras de se expressar relacionamentos entre documentos no MongoDB.

Referências entre documentos: é possível guardar o _id de um documento como um atributo em outro documento.

Documentos embutidos: o MongoDB permite guardar um documento inteiro como um atributo em um documento (SubDocumentos).

#### Características dos Documentos

* Os nomes das coleções devem seguir algumas regras
* Devem começar com uma letra ou um undercore
* Podem conter letras, numeros ou underscores
* Não podem ser vazios
* Não podem ter mais de 64 bytes de comprimento
* São armazenados em documentos BSON(Binary JSON), que são estruturas flexíveis e semiestruturadas
* Cada documento possui um identificador único chamado "_id"
* Não é necessário (Mas é possível) especificar o ID dos documentos
* É composto por pares chamados de chaves e valores
* Tamanho máximo: Cada documento no MongoDB pode ter o tamanho máximo de 16 MB
* Flexibilidade na evolução do esquema
* Não é necessário especificar o tipo dos atributos

#### Tipos de dados simples

* String
* Number
* Boolean
* Date
* Null
* Object

#### Tipos de dados complexos

* Array
* Documento embutido(Embedded Document)
* Referência(Reference)
* GeoJSON

##### Estrutura de um Documento

~~~
{
   _id: Object(""),
   "nome_campo": "valor_campo",
   ...
}
~~~

### Estratégias de modelagem de Dados eficientes e escaláveis

#### Modelagem orientada para consultas

A modelagem de Dados do MongoDB deve ser orientada pelas consultas que serão realizadas com mais frequência.

#### Inner Documents

No mongoDB, é muito comum densormalizar os Dados para evitar operações de junção(joins) custosas.

Isso significa que os Dados relacionados podem ser armazenados juntos em um único documento, em vez de serem distribuídos em várias coleções.

##### Quando usar

Quando os Dados aninhados são específicos para o documento pai.

Quando os Dados aninhados são sempre acessados juntamente com o documento pai.

Quando a cardinalidade do documento é de um-para-muitos.

##### Quando não utilizar

Se os Dados aninhados precisarem ser consultados e atualizados independente do documento pai, é mais adequado utilizar coleções separadas.

#### Referências

Forma de relacionar os documentos entre si.

##### Quando usar

Quando os Dados tem seu próprio significado e podem ser acessados independente do documento pai.

Quando os Dados tem uma cardinalidade mais alta.

##### Quando não usar

Se os Dados aninhados precisarem ser consultados e atualizados independentemente do documento pai, é mais adequado utilizar coleções separadas.

O MongoDB possui diversos métodos e operadores que permitem a realização de consultas complexas em seus Dados.

#### Operadores lógicos

* $and
* $or
* $not

#### Operadores de comparação

* $eq: ==
* $ne: !=
* $gt: >
* $gte: >=
* $It: <
* $Ite: <=
* $in: [ ]
* $nin: [ ]

O MongoDB abstrai diversos comandos DDL, estruturas são criadas conforme estas se tornam necessárias.

#### Operações CRUD

##### Insert

Existem duas operações de inserção no MongoDB:

* Inserção de um único documento: insertOne.
* Recebe como parâmetro um único documento.

Inserção de múltiplos documentos de uma só vez:

* insertMany.
  
* Recebe como parâmetro um vetor de documentos.

##### Select

O MongoDB possui dois métodos principais para retornar informações de documentos.

* O método find() retorna um ponteiro para todos os documentos que atendem aos critérios especificados.
* O método findOne() retorna um único documento que atende aos critérios especificados.
* Caso exista mais de um documento atendendo aos critérios, o método findOne() retorna apenas o primeiro

##### Update

O MongoDB possui três métodos para atualização de Dados em um documento.

* Os médotos updateOne() e updateMany() localizam o documento segundo os critérios especificados e fazem as alterações descritas.
* Enquanto o updateOne() afeta somente um documento que atenda os critérios, o updateMany() afeta todos.
* O método replaceOne() localiza um único documento que atenda aos critérios especificados e o substitui por um novo documento. O atributo _id do documento permanece o mesmo.

##### Delete

O MongoDB possui dois métodos para a remoção de documentos.

* Os médotos deleteOne() e deleteMany() localizam o documento segundo os critérios especificados e o removem da base de Dados.
* Enquanto o deleteOne() afeta somente um documento que atenda os critérios, o deleteMany() afeta todos.