package me.dio.introduction.functions

fun main() {

    fun printAll(vararg messages: String) { // Vararg a quantidade de parâmetros é indefinida podemos passar quantos quisermos,
        for (m in messages) println(m)      // desde que respeitemos o tipo, no exemplo passamos 5 parâmetros.
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )

    fun log(vararg entries: String) { // O vararg é do tipo array, para passar como parâmetro vararg necessita do operador *
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}