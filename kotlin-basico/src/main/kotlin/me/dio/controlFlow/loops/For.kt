package me.dio.controlFlow.loops

fun main() {

    val cakes = listOf("carrot", "cheese", "chocolate") // Criando lista e adicionando 3 elementos

    for (cake in cakes) {                               // Iterando sobre a lista
        println("Yummy, it's a $cake cake!")            // A cada iteração mostra o valor atual da variavel cake.
    }


}