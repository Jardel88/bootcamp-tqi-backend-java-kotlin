package me.dio.controlFlow.loops

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // Define um iterador em uma classe. Deve ser nomeado iteratore ter o operatormodificador.
        return animals.iterator()
    }
}

fun main() {

    val animals = listOf(Animal("zebra"), Animal("lion"))
    val zoo = Zoo(animals)

    for (animal in zoo) {                                   // Percorre os animais do zoológico com o iterador definido pelo usuário.
        println("Watch out, it's a ${animal.name}")
    }

}