package me.dio.poo.classesEspeciais

/*
    Data Class facilita a criação de classes usadas para armazenar valores. Essas classes recebem automaticamente métodos para copiar,
    obter uma representação de string e usar instâncias em coleções. Você pode substituir esses métodos por suas próprias implementações na declaração da classe.
*/

data class User(val name: String, val id: Int) {           // Define uma classe de dados com o datamodificador.
    override fun equals(other: Any?) =
        other is User && other.id == this.id               // Substitua o método padrão equals declarando os usuários iguais se eles tiverem o mesmo arquivo id.
}
fun main() {
    val user = User("Alex", 1)
    println(user)                                          // O método toString é gerado automaticamente, o que torna println a saída bonita.

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // Nosso costume equals considera duas instâncias iguais se seus ids forem iguais.
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())                               // Instâncias de classe de dados com atributos exatamente correspondentes têm o mesmo arquivo hashCode.
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())                                   // A função gerada automaticamente copy facilita a criação de uma nova instância.
    println(user === user.copy())                          // copy cria uma nova instância, para que o objeto e sua cópia tenham referências distintas.
    println(user.copy("Max"))                        // Ao copiar, você pode alterar os valores de determinadas propriedades. copy aceita argumentos na mesma ordem que o construtor da classe.
    println(user.copy(id = 3))                             // Use copy com argumentos nomeados para alterar o valor independentemente da ordem das propriedades.

    println("name = ${user.component1()}")                 // Funções geradas automaticamente componentN permitem obter os valores das propriedades na ordem de declaração.
    println("id = ${user.component2()}")
}