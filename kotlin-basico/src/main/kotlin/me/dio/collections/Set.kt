package me.dio.collections

/*
    O set é uma coleção não ordenada que não suporta duplicatas. Para criar conjuntos, existem funções setOf()e mutableSetOf().
    Uma visualização somente leitura de um conjunto mutável pode ser obtida convertendo-o para Set.
*/

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // Cria um Set com determinados elementos.

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)                                                             // Retorna um valor booleano que mostra se o elemento foi realmente adicionado.
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // Retorna uma string, com base no parâmetro de entrada da função.
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // Imprime uma mensagem de sucesso: o novo elemento é adicionado ao arquivo Set.
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // Imprime uma mensagem de falha: o elemento não pode ser adicionado porque duplica um elemento existente.
}