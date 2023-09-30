package me.dio.functions

// Certas funções podem ser "atualizadas" para operadores, permitindo suas chamadas com o símbolo do operador correspondente.

fun main() {

    operator fun Int.times(str: String) = str.repeat(this)           // Isso leva a função infix acima um passo adiante usando o operator modificador.
    println(2 * "Bye ")                                                 // O símbolo do operador para times() é * para que você possa chamar a função usando 2 * "Bye".

    operator fun String.get(range: IntRange) = substring(range)         // Uma função de operador permite fácil acesso ao intervalo em strings.
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])                                           // O get() operador permite sintaxe de acesso a colchetes.

}