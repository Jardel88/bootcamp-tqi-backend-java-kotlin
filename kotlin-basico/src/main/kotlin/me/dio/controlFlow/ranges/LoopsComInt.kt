package me.dio.controlFlow.ranges

fun main() {

    for(i in 0..3) {             // Itera em um intervalo que começa de 0 a 3 (inclusive). Como 'for(i=0; i<=3; ++i)'
        print(i)                       // em outras linguagens de programação (C/C++/Java).
    }
    print(" ")

    for(i in 0 until 3) {        // Itera em um intervalo de 0 a 3 (exclusivo). Como for loop em Python ou como 'for(i=0; i<3; ++i)'
        print(i)                       // em outras linguagens de programação (C/C++/Java).
    }
    print(" ")

    for(i in 2..8 step 2) {      // Itera em um intervalo com uma etapa de incremento personalizada para elementos consecutivos.
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // Itera em um intervalo na ordem inversa .
        print(i)
    }
    print(" ")


}