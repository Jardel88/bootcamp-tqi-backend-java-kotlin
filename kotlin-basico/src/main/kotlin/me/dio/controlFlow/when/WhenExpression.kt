package me.dio.controlFlow.`when`

fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any {                 // Função que recebe um tipo Any e retorna um tipo Any.
    val result = when (obj) {                   // Esta é uma expressão when.
        1 -> "one"                              // Define o valor "one"como se obj for igual a 1.
        "Hello" -> 1                            // Define o valor como um se obj for igual a "Hello".
        is Long -> false                        // Define o valor como false se obj é uma instância de Long.
        else -> 42                              // Define o valor 42 se nenhuma das condições anteriores for satisfeita.
    }
    return result
}
