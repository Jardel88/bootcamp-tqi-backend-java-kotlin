package me.dio.classes

class Customer                                  // Declaração simples de classe, sem passagem de parâmetros

class Contact(val id: Int, var email: String)   // Declaração de classe com passagem de parâmetros, com um valor imutável e um valor mutável

fun main() {

    val customer = Customer()                   // Intancia de um objeto simples sem parâmetros

    val contact = Contact(1, "mary@gmail.com")  // Intancia de um objeto com parâmetros

    println(contact.id)
    println(contact.email)
    contact.email = "jane@gmail.com"            // Atribuindo novo valor para variável var
    println(contact.email)
}