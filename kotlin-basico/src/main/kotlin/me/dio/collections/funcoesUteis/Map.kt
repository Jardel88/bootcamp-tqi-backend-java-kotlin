package me.dio.collections.funcoesUteis

/*
    A função de extensão de map permite aplicar uma transformação a todos os elementos de uma coleção.
    É necessária uma função de transformador como parâmetro lambda.
*/

fun main() {


    val numbers = listOf(1, -2, 3, -4, 5, -6)     // Define uma coleção de números.

    val doubled = numbers.map { x -> x * 2 }      // Duplica números.

    val tripled = numbers.map { it * 3 }          // Usa a it notação mais curta para triplicar os números.


    println("Numbers: $numbers")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")
}