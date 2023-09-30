package me.dio.functions

/*
    É possível executar extensões em referências null.
    Em uma função de extensão, você pode verificar o objeto null e usar o resultado em seu código:
*/

fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"
fun main() {
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}