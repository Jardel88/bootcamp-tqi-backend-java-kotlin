package me.dio.functions.scopeFunctions

/*
    apply executa um bloco de código em um objeto e retorna o próprio objeto.
    Dentro do bloco, o objeto é referenciado por this. Esta função é útil para inicializar objetos.
*/

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {

    val jake = Person()                                     // Cria uma Person() instância com valores de propriedade padrão.
    val stringDescription = jake.apply {           // Aplica o bloco de código (próximas 3 linhas) à instância.
        name = "Jake"                                       // Por dentro apply, é equivalente a jake.name = "Jake".
        age = 30
        about = "Android developer"
    }.toString()                                            // O valor de retorno é a própria instância, portanto você pode encadear outras operações.

    println(stringDescription)
}