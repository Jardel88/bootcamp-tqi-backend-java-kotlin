package me.dio.controlFlow.ranges

fun main() {

    for (c in 'a'..'d') {        // Itera em um intervalo de caracteres em ordem alfabética.
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // Suporte para intervalos de caracteres step e downTo também.
        print(c)
    }
    print(" ")

    val x = 2
    if (x in 1..5) {            // Verifica se um valor está no intervalo.
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {          // !in é o oposto de in.
        print("x is not in range from 6 to 10")
    }

}