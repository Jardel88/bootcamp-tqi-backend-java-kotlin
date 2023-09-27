package me.dio.collections

/*
    O map é uma coleção de pares chave/valor, onde cada chave é única e é usada para recuperar o valor correspondente.
    Para criar maps, existem funções mapOf()e mutableMapOf(). Usando o to A função infix torna a inicialização menos barulhenta.
    Uma visualização somente leitura de um map mutável pode ser obtida convertendo-o para Map.
*/

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // Cria um mutável Map.
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // Cria uma visualização somente leitura do arquivo Map.

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {                                        // Verifica se o Map chave do existe.
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // Lê o valor correspondente e incrementa-o com um valor constante.
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {                                                              // Itera imutável Map e imprime pares chave/valor.
            k, v -> println("ID $k: credit $v")
    }
}

fun main() {
    accountsReport()                                                                    // Lê o saldo de pontos da conta, antes das atualizações.
    updatePointsCredit(1)                                                       // Atualiza uma conta existente duas vezes.
    updatePointsCredit(1)
    updatePointsCredit(5)                                                       // Tenta atualizar uma conta inexistente: imprime uma mensagem de erro.
    accountsReport()                                                                    // Lê o saldo de pontos da conta, após atualizações.
}