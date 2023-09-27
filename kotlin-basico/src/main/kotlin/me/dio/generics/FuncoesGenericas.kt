package me.dio.generics

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements) //funçãogenerica para criação de pilhas

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}