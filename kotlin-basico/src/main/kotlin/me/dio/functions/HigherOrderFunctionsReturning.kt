package me.dio.functions

fun operation(): (Int) -> Int {                                     // Declara uma Higher-Order Function que retorna uma função. (Int) -> Int representa os parâmetros e o tipo de retorno da square function.
    return ::square
}

fun square(x: Int) = x * x                                          // Declara uma função que corresponde à assinatura.

fun main() {
    val func = operation()                                          // Invoca operation para obter o resultado atribuído a uma variável. Aqui func torna-se square o que é retornado por operation.
    println(func(2))                                                // Invoca func. A square function é na realidade executada.
}