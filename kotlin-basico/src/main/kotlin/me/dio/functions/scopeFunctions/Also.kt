package me.dio.functions.scopeFunctions

/*
    also funciona como apply: executa um determinado bloco e retorna o objeto chamado.
    Dentro do bloco, o objeto é referenciado por it, então é mais fácil passá-lo como argumento.
    Esta função é útil para incorporar ações adicionais, como registrar em cadeias de chamadas.
*/

data class PersonObj(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: PersonObj) {
    println("A new person ${p.name} was created.")
}

fun main() {

    val jake = PersonObj("Jake", 30, "Android developer")   // Cria um Person() objeto com os valores de propriedade fornecidos.
        .also {                                                   // Aplica o bloco de código fornecido ao objeto. O valor de retorno é o próprio objeto.
            writeCreationLog(it)                                            // Chama a função de registro passando o objeto como argumento.
        }

}