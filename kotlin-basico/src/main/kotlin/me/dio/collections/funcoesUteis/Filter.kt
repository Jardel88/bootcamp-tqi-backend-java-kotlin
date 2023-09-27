package me.dio.collections.funcoesUteis

/*
    A função filter permite filtrar coleções. É necessário um predicado de filtro como parâmetro lambda.
    O predicado é aplicado a cada elemento. Os elementos que constituem o predicado true são retornados na coleção de resultados.
*/

fun main() {


    val numbers = listOf(1, -2, 3, -4, 5, -6)      // Define a coleção de números.

    val positives = numbers.filter { x -> x > 0 }  // Obtém números positivos.

    val negatives = numbers.filter { it < 0 }      // Usa a itnotação mais curta para obter números negativos.


    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")
}