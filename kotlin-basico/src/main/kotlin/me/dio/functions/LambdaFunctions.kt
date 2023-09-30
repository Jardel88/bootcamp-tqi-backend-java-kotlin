package me.dio.functions

/*
    Lambda functions ("lambdas") são uma maneira simples de criar funções ad-hoc. Lambdas podem ser denotados de forma
    muito concisa em muitos casos, graças à inferência de tipo e à itvariável implícita.
*/

fun main() {

    // Todos os exemplos criam um objeto de função que executa upper-casing.
    // Então é uma função de String para String

    val upperCase1: (String) -> String = { str: String -> str.uppercase() } // Um lambda em toda a sua glória, com tipos explícitos em todos os lugares. O lambda é a parte entre chaves, que é atribuída a uma variável de tipo (String) -> String (um tipo de função).

    val upperCase2: (String) -> String = { str -> str.uppercase() }         // Inferência de tipo dentro de lambda: o tipo do parâmetro lambda é inferido do tipo da variável à qual está atribuído.

    val upperCase3 = { str: String -> str.uppercase() }                     // Inferência de tipo fora do lambda: o tipo da variável é inferido do tipo do parâmetro lambda e do valor de retorno.

    // val upperCase4 = { str -> str.uppercase() }                          // Você não pode fazer as duas coisas juntas, o compilador não tem chance de inferir o tipo dessa maneira.

    val upperCase5: (String) -> String = { it.uppercase() }                 // Para lambdas com um único parâmetro, não é necessário nomeá-lo explicitamente. Em vez disso, você pode usar a it variável implícita. Isto é especialmente útil quando o tipo de it pode ser inferido (o que geralmente é o caso).

    val upperCase6: (String) -> String = String::uppercase                  // Se o seu lambda consistir em uma única chamada de função, você poderá usar ponteiros de função ( ::).

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))

}
