package me.dio.functions.scopeFunctions

/*
    Como let, run é outra função de escopo da biblioteca padrão. Basicamente, faz a mesma coisa: executa um bloco de código
    e retorna seu resultado. A diferença é que dentro run do objeto é acessado por this. Isso é útil quando você deseja chamar
    os métodos do objeto em vez de passá-lo como argumento.
*/

fun main() {

    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {                                         // Chama o bloco fornecido em uma variável anulável.
            println("\tis empty? " + isEmpty())                    // Dentro run, os membros do objeto são acessados sem o seu nome.
            println("\tlength = $length")
            length                                            // run retorna o length do dado String se não for null.
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

}