package me.dio.controlFlow.igualdade

fun main() {


    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // Retorna true porque chama authors.equals(writers) e define ignorar a ordem dos elementos.
    println(authors === writers)  // Retorna false porque authors e writers são referências distintas.

}