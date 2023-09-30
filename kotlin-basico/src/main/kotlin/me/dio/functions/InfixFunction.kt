package me.dio.functions

// Funções-membro e extensões com um único parâmetro podem ser transformadas em infix functions.

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)     // Define uma função de extensão infix em Int.
    println(2 times "Bye ")                                    // Chama a função infix.

    val pair = "Ferrari" to "Katrina"                          // Cria um Pair chamando a função infix to da biblioteca padrão.
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // Aqui está sua própria implementação de to chamada criativamente onto.
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia                                       // A notação infix também funciona em funções de membros (métodos).
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // A classe que contém se torna o primeiro parâmetro.
}