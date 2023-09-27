package me.dio.introduction.variaveis

fun main() {
    var a: String = "initial"  // Variavel mutável
    println(a)
    a = "final"
    println(a)
    val b: Int = 1             // Variavel imutável
    println(b)
    val c = 3                  // Inferência de tipo
    println(c)

    //----------------------------------

    var e: Int  // Uma variável precisa ser inicializada
    //println(e) // Uma tentativa de usar a variável causa um erro do compilador: Variable 'e' must be initialized.

    //----------------------


    val d: Int  // variável não inicializada

    if (someCondition()) { // Este bloco de código garante que a variável será inicializada
        d = 1   // 2
    } else {
        d = 2   // 2
    }

    println(d) // 3
}

fun someCondition() = true