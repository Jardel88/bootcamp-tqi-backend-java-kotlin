package me.dio.controlFlow.`when`

/*
* Em vez da declaração amplamente utilizada , O Kotlin fornece uma construção switch mais flexível e clara .
* when Pode ser usado como um statement ou como uma expressão.
* */

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {                                // Recebe um parâmetro do tipo Any(Qualquer coisa)
    when (obj) {                                     // Esta é uma when statement.
        1 -> println("One")                          // Verifica se objé igual a 1.
        "Hello" -> println("Greeting")               // Verifica se objé igual a "Hello".
        is Long -> println("Long")                   // Executa verificação de tipo.
        !is String -> println("Not a string")        // Executa verificação de tipo inversa.
        else -> println("Unknown")                   // Instrução padrão (pode ser omitida).
    }
}

class MyClass