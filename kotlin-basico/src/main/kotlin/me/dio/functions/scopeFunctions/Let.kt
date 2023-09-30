package me.dio.functions.scopeFunctions

/*
    A função da biblioteca padrão Kotlin let pode ser usada para escopo e verificações de nulos. Quando chamado em um objeto,
    let executa o bloco de código fornecido e retorna o resultado de sua última expressão.
    O objeto é acessível dentro do bloco pela referência it(por padrão) ou por um nome personalizado.
*/

fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {

    val empty = "test".let {                // Chama o bloco fornecido no resultado da string " test ".
        customPrint(it)                            // Chama a função em " test " pela it referência.
        it.isEmpty()                          // let retorna o valor desta expressão.
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // Usa chamada segura, portanto letseu bloco de código será executado apenas em valores não nulos.
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->              // Usa o nome personalizado em vez de it, para que o aninhado let possa acessar o objeto de contexto do externo let.
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First","Second")

}