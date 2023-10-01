package me.dio.exceptions

import java.lang.ArithmeticException

/*
    Todas as classes de exceção em Kotlin herdam a classe Throwable.
    Cada exceção possui uma mensagem, um rastreamento de pilha e uma causa opcional.
 */


fun main() {

    //  throw Exception("Hi There!") Para lançar um objeto de exceção, use a expressão throw:

    // Para capturar uma exceção, use a expressão try... :catch
    val a = 10
    val b = 0

    try {
        val divisao = a/b
        println(divisao)
    } catch (e: ArithmeticException){
        println("Ocorreu uma exceção aritimética")
    } finally { // O bloco finally é opcional, executado independente de ocorrer uma exceção ou não
        println("Finally executado")
    }

}