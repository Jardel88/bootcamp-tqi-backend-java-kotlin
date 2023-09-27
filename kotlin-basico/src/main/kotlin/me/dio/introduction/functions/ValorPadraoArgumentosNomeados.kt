package me.dio.introduction.functions

fun printMessage(message: String): Unit {  //Função que recebe parâmetro e não tem retorno equivalente ao void do java
    println(message)                       //Unit é implícito não precisa ser declarado
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // Função com prefixo, caso não seja atribuido nenhum
                                                                        // valor ao prefixo, é passado um valor como padrão.
    println("[$prefix] $message")  //Interpolação de string
}

fun sum(x: Int, y: Int): Int { // Função com returno de valor, no caso retorna um valor do tipo inteiro
    return x + y
}

fun multiply(x: Int, y: Int) = x * y //Função inline, definida em apenas uma linha, o kotlin consegue definir o tipo de retorno

fun main() {
    printMessage("Hello")                                               // 5
    printMessageWithPrefix("Hello", "Log")                // 6
    printMessageWithPrefix("Hello")                             // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                            // 9
    println(multiply(2, 4))                                       // 10
}