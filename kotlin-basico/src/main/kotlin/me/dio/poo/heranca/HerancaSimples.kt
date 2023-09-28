package me.dio.poo.heranca

open class Dog {                // As classes Kotlin são finais por padrão. Se você deseja permitir a herança de classe, marque a classe com o open modificador.
    open fun sayHello() {       // Os métodos Kotlin também são finais por padrão. Tal como acontece com as classes, o open modificador permite substituí-las.
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // Uma classe herda uma superclasse quando você especifica : SuperclassName() após seu nome. Os parênteses vazios ()indicam uma invocação do construtor padrão da superclasse.
    override fun sayHello() {   // A substituição de métodos ou atributos requer o overridemodificador.
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}