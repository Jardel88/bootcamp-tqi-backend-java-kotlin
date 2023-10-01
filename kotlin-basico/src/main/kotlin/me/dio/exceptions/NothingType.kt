package me.dio.exceptions

/*
    throw é uma expressão em Kotlin, então você pode usá-la, por exemplo, como parte de uma Elvis expression:
    val s = person.name ?: throw IllegalArgumentException("Name required")
*/
data class Person(val name: String?)

fun main() {
    val person = Person(null)
    val s = person.name ?: fail("Name required") // 1 - O código é interrompido neste ponto, antes de 's' ser inicializado.
    println(s) // 1 - 's' é inicializado neste ponto

/*
    Você também pode encontrar esse tipo ao lidar com inferência de tipos.
    A variante nullable deste tipo, Nothing? tem exatamente um valor possível, que é null.
    Se você usar null para inicializar um valor de um tipo inferido e não houver outras informações que
    possam ser usadas para determinar um tipo mais específico, o compilador inferirá o tipo Nothing?:
*/
    val x = null           // 'x' tem tipo `Nothing?`
    val l = listOf(null)   // 'l' tem tipo `List<Nothing?>
    println(x)
    println(l)
}

/*
   1 - A throw expression tem o tipo Nothing. Este tipo não possui valores e
    é usado para marcar locais de código que nunca podem ser alcançados.
    No seu próprio código, você pode usar Nothing para marcar uma função que nunca retorna:
*/

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
