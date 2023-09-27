package me.dio.controlFlow.expressaoCondicional

fun main() {

    fun max(a: Int, b: Int) = if (a > b) a else b         // if é uma expressão aqui : ela retorna um valor, semelhante ao ternário.

    fun maxOld(a: Int, b: Int): Int {                     // Forma antiga
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    println(max(99, -42))
    println(maxOld(99, -42))
}