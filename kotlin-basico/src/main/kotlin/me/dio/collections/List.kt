package me.dio.collections

/*
    A lista é uma coleção ordenada de itens. No Kotlin, as listas podem ser ( MutableList) ou somente leitura ( List).
    Para a criação de listas, use as funções de biblioteca padrão listOf()para listas somente leitura e mutableListOf()para listas mutáveis.
    Para evitar modificações indesejadas, obtenha visualizações somente leitura de listas mutáveis convertendo-as para List.
*/

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // Cria um MutableList.
val sudoers: List<Int> = systemUsers                              // Cria uma visualização somente leitura da lista.

fun addSystemUser(newUser: Int) {                                 // Adiciona um novo item ao arquivo MutableList.
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  // Uma função que retorna um imutável List.
    return sudoers
}

fun main() {
    addSystemUser(4)                                       // Atualiza o MutableList. Todas as visualizações somente leitura relacionadas também são atualizadas, pois apontam para o mesmo objeto.
    println("Tot sudoers: ${getSysSudoers().size}")                // Recupera o tamanho da lista somente leitura.
    getSysSudoers().forEach {                                      // Itera a lista e imprime seus elementos.
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!                            // A tentativa de gravar na visualização somente leitura causa um erro de compilação.
}