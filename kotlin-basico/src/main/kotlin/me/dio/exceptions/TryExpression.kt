package me.dio.exceptions

/*
    try é uma expressão, o que significa que pode ter um valor de retorno:

    val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }

    O valor retornado de uma try expression é a última expressão do bloco try ou a última expressão do bloco catch (ou blocos).
    O conteúdo do bloco finally não afeta o resultado da expressão.
*/

fun main() {
    val a = 10
    val b = 0

    val divisao = try { a/b } catch (e: ArithmeticException) { null }
    println(divisao)
}