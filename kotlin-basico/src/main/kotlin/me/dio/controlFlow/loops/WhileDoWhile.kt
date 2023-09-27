package me.dio.controlFlow.loops

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {                    // Primeiro verifica a expressão, executa a instrução.
        eatACake()
        cakesEaten ++
    }

    do {                                        // Primeiro executa a instrução, depois verifica a expressão.
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}