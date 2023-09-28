package me.dio.poo.heranca

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia") // Se você quiser usar um construtor parametrizado da superclasse ao criar uma subclasse,
                                             // forneça os argumentos do construtor na declaração da subclasse.
fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}