package me.dio.poo.classesEspeciais

/*
    Sealed Class permitem restringir o uso de herança. Depois de declarar uma classe selada,
    ela só poderá ser subclassificada dentro do mesmo pacote onde a classe selada foi declarada.
    Ela não pode ser subclassificada fora do pacote onde a classe selada é declarada.
*/

sealed class Mammal(val name: String)                                                   // Define uma classe selada.

class Cat(val catName: String) : Mammal(catName)                                        // Define subclasses. Observe que todas as subclasses devem estar no mesmo pacote.
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                                                     // Usa uma instância da classe selada como argumento em uma when expressão.
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // Um smart cast é executado, transmitindo Mammal para Human.
        is Cat -> return "Hello ${mammal.name}"                                         // Um smartcast é executado, transmitindo Mammal para Cat.
    }                                                                                   // O else-case não é necessário aqui, pois todas as subclasses possíveis da classe selada são cobertas. Com uma superclasse não selada else seria necessária.
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}