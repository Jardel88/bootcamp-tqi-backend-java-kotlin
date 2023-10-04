package me.dio.desafios

/*
    Descrição
    No mundo da programação, frequentemente enfrentamos situações onde múltiplas tarefas precisam ser executadas
    simultaneamente para otimizar o tempo de resposta ou processamento. Um exemplo comum é o download de múltiplos arquivos
    da internet.

    Para este desafio, suponha que você tenha uma lista de URLs que deseja "baixar". Seu objetivo é simular o download
    desses arquivos de forma paralela e imprimir o tamanho de cada URL após seu "download" ter sido disparado. Para simplificar,
    cada URL leva exatamente 1 segundo para ser "baixado".

    Requisitos:

    Defina uma lista de URLs que você deseja "baixar".
    Crie uma função para simular o "download" de uma URL. Essa função deve aceitar uma URL como entrada e retornar o tamanho da URL.
    Implemente uma lógica que permita iniciar o "download" de várias URLs em paralelo.
    Imprima o tamanho de cada URL na ordem em que foram inseridas.
    Entrada
    A entrada consiste em uma lista de URLs, uma em cada linha. Uma linha vazia indica o fim da lista.

    Saída
    A saída deve mostrar o tamanho de cada URL na ordem em que foram inseridas, seguido pelo "Tempo total", que é simplesmente a
    contagem de URLs.

    Exemplos
    A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar
    seu programa com esses exemplos e com outros casos possíveis.

    Entrada	                            Saída
    https://chat.openai.com/            Iniciando downloads...
    https://www.invertexto.com/         Arq1: 24
    https://web.dio.me/                 Arq2: 27
    [Linha vazia]                       Arq3: 19
                                        Tempo total: 3

    Nota:
    A simulação de download é uma forma simplificada de entender como tarefas paralelas podem ser disparadas e como os
    resultados podem ser coletados de volta na ordem desejada.

    No contexto do Kotlin, recomendamos o estudo das Coroutines, um conceito de programação concorrente que permite que você
    escreva código assíncrono de maneira mais legível e estruturada:
    https://kotlinlang.org/docs/multiplatform-mobile-concurrency-and-coroutines.html#coroutines
 */

fun main() {
    val urls = mutableListOf<String>()

    while (true) {
        println("Digite a url tecle enter para finalizar:")
        val input = readLine() ?: break
        if (input.isBlank()) break
        urls.add(input)
    }

    println("Iniciando downloads...")

    // Cria uma lista de Pair (indice, tamanho)
    val results = mutableListOf<Pair<Int, Int>>()

    val threads = urls.mapIndexed { index, url ->
        Thread {
            val length = openLink(url)
            synchronized(results) {
                results.add(Pair(index, length))
            }
        }
    }

    // TODO: Inicie cada Thread para começar o processo de "download" paralelamente.
    threads.forEach { thread ->
        thread.start()
        thread.join()
    }
    // TODO: Aguarde até que todas as Threads terminem suas respectivas execuções.

    // Sort results by index to print in the correct order
    results.sortedBy { it.first }.forEachIndexed { idx, result ->
        println("Arq${idx + 1}: ${result.second}")
    }

    println("Tempo total: ${urls.size}")
}

fun openLink(url: String): Int {
    return url.length
}