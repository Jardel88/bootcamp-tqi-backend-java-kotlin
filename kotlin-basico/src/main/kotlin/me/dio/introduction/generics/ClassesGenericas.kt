package me.dio.introduction.generics

class MutableStack<E>(vararg items: E) { // Define uma classe genérica MutableStack<E>onde Eé chamado de parâmetro de tipo genérico

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element) // Dentro da classe genérica, Epode ser usado como parâmetro como qualquer outro tipo.
                                                 // push adiciona um elemento
    fun peek(): E = elements.last()              // peek pega um elemento sem remover
                                                 // E pode ser usado como tipo de retorno como na função 2 e 3
    fun pop(): E = elements.removeAt(elements.size - 1) // pop remove um elemento

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main() {
    val stack = MutableStack(0.62, 3.14, 2.7) // Criação de pilha mutável
    stack.push(9.87)    // Adicionando elemento a pilha
    println(stack)

    println("peek(): ${stack.peek()}") //Pegando o elemento que está no topo da pilha, sem remover
    println(stack)

    for (i in 1..stack.size()) { // Iterando sobre o tamanho da pilha
        println("pop(): ${stack.pop()}") // A cada iteração faz o pop, removendo o elemento do topo da pilha
        println(stack)
    }
}