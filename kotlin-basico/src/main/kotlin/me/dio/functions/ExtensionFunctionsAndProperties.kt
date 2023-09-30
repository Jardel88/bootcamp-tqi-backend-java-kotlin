package me.dio.functions

/*
    Kotlin permite adicionar novos membros a qualquer classe com o mecanismo de extensões.
    Ou seja, existem dois tipos de extensões: funções de extensão e propriedades de extensão.
    Eles se parecem muito com funções e propriedades normais, mas com uma diferença
    importante: você precisa especificar o tipo que deseja estender.
*/

data class Item(val name: String, val price: Float)                                         // Define modelos simples de Item e Order. Order pode conter uma coleção de Item objetos.

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // Adiciona funções de extensão para o tipo Order.
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String                                                   // Adiciona uma propriedade de extensão para o tipo Order.
    get() = items.map { it.name }.joinToString()

fun main() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}")                           // Chama funções de extensão diretamente em uma instância do Order.
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                                      // Acessa a propriedade de extensão em uma instância do Order.

}