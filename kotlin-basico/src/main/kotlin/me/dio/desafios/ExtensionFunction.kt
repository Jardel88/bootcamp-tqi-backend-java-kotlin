package me.dio.desafios

/*
    Descrição
    As Extension Functions, ou Funções de Extensão, são recursos poderosos disponíveis em linguagens de programação que
    permitem adicionar métodos a classes existentes sem a necessidade de modificar o código-fonte original dessas classes.
    Isso facilita a criação de novas funcionalidades ou comportamentos para tipos de dados já existentes,
    mesmo quando você não tem acesso ao código fonte original desses tipos.

    Neste desafio, com foco em um sistema de gerenciamento de livros para uma biblioteca digital, você deve implementar uma
    solução que permita gerar um "slug" único para representar os dados de um livro. Um "slug" é uma versão simplificada e
    amigável para URLs de um texto, com espaços substituídos por traços (-) e caracteres especiais removidos.
    A solução requer que você crie uma função de extensão generateSlug() para a classe String que fará essa transformação.

    Funcionalidade a ser implementada:

    generateSlug(): Crie uma função de extensão chamada generateSlug() para a classe String. A função deve gerar um "slug"
    para a string fornecida, removendo espaços e caracteres especiais, substituindo-os por traços.

    Entrada
    A entrada consistirá em duas strings: o título e o autor de um livro.

    Saída
    Imprima o "slug" gerado para o livro, no seguinte padrão:
    {nome-livro-separado-por-ifens_nome-autor-separado-por-ifens}

    Exemplos
    A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de
    testar seu programa com esses exemplos e com outros casos possíveis.

    Entrada	                            Saída
    Senhor dos Aneis                    Slug gerado para o livro:
    J. R. R Tolkien                     senhor-dos-aneis_j-r-r-tolkien

    Nota:
    O uso de extension functions tem seus pontos positivos, como a extensibilidade e organização do código,
    mas também apresenta desafios, como a possível confusão e a separação da lógica. A solução eficiente depende da
    linguagem de programação escolhida e das práticas de programação adotadas.

    Saiba mais sobre Extension Functions em Kotlin:
    https://kotlinlang.org/docs/extensions.html#extension-functions
*/

fun main() {

    println("Digite o título do livro:")
    val titulo = readLine() ?: ""

    println("Digite o autor do livro:")
    val autor = readLine() ?: ""

    // Aqui usamos a Extension Function "generateSlug()" nas Strings de Entrada.
    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()

    println("Slug gerado para o livro: ")
    println("${slugTitulo}_${slugAutor}")
    //TODO: Formatar/Imprimir as slugs considerando o padrão de saída deste desafio.
}

fun String.generateSlug() =
    toLowerCase()
    .replace("\n", " ")
    .replace("[^a-z\\d\\s]".toRegex(), " ")
    .split(" ")
    .joinToString("-")
    .replace("-+".toRegex(), "-")