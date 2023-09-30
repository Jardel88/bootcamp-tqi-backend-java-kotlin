package me.dio.functions

// A Higher-Order Functions é uma função que recebe outra função como parâmetro e/ou retorna uma função.

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // Declara uma Higher-Order Function. São necessários dois parâmetros inteiros x e y. Além disso, leva outra função operation como parâmetro. Os operation parâmetros e o tipo de retorno também são definidos na declaração.
    return operation(x, y)                                          // A Higher-Order Function retorna o resultado da operation invocação com os argumentos fornecidos.
}

fun sum(x: Int, y: Int) = x + y                                     // Declara uma função que corresponde à operation assinatura.

fun main() {
    val sumResult = calculate(4, 5, ::sum)                     // Invoca a Higher-Order Function passando dois valores inteiros e o argumento da função ::sum. :: é a notação que faz referência a uma função pelo nome em Kotlin.
    val mulResult = calculate(4, 5) { a, b -> a * b }          // Invoca a Higher-Order Function passando um lambda como argumento de função.
    println("sumResult $sumResult, mulResult $mulResult")
}