package me.dio.poo.heranca

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India") // name na Asiatic declaração não há var nem val: é um argumento construtor, cujo valor é passado para a name propriedade da superclasse Lion.

fun main() {
    val lion: Lion = Asiatic("Rufo")                        // Cria uma Asiatic instância com o nome Rufo. A chamada invoca o Lion construtor com argumentos Rufo e India.
    lion.sayHello()
}