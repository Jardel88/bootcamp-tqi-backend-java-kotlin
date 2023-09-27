package me.dio.collections.funcoesUteis

/*
    flatMap transforma cada elemento de uma coleção em um objeto iterável e constrói uma única lista dos resultados da transformação.
    A transformação é definida pelo usuário.
*/

fun main() {


    val fruitsBag = listOf("apple","orange","banana","grapes")  // Define uma coleção de Strings com nomes de frutas.
    val clothesBag = listOf("shirts","pants","jeans")           // Define uma coleção de Strings com nomes de roupas.
    val cart = listOf(fruitsBag, clothesBag)                    // Adiciona fruitsBag e clothesBag à cart lista.
    val mapBag = cart.map { it }                                // Constrói um conjunto map de cart elementos, que é uma lista de duas listas.
    val flatMapBag = cart.flatMap { it }                        // Constrói um conjunto flatMap de cart elementos, que é uma lista única composta por elementos de ambas as listas.


    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")
}