package me.dio.poo.classesEspeciais

/*
    Enum Class são usados para modelar tipos que representam um conjunto finito de valores distintos,
    como direções, estados, modos e assim por diante.
*/

enum class State {
    IDLE, RUNNING, FINISHED                           // Define uma classe enum simples com três constantes enum. O número de constantes é sempre finito e todas são distintas.
}

fun main() {
    val state = State.RUNNING                         // Acessa uma constante enum por meio do nome da classe.
    val message = when (state) {                      // Com enums, o compilador pode inferir se uma when expressão -é exaustiva para que você não precise do else-case.
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}


