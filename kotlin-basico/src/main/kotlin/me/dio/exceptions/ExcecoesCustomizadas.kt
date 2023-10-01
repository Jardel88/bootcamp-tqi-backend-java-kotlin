package me.dio.exceptions

class IllegalVoterException(message: String) : Throwable(message) // Cria uma classe de exceção customizada

@Throws(IllegalVoterException::class) // Documenta que essa funçaõ lançará uma exceção do tipo IllegalVoteException.
fun vote(name: String, age: Int) { // Cria a função passando nome e idade como argumento
    if (age < 16) { // Verifica se idade é menor que 16
        throw IllegalVoterException("$name não pode votar.") // Se for menor lança uma exceção
    }
    println("Voto de $name realizado com sucesso!")

}

fun main() {
    var quantidadeVotos = 0;                // Cria variavel para guardar quantidade de votos

    quantidadeVotos += try {                // Variavel quantidadeVotos Recebe try expression que chama a função vote
        vote("José", 33)
        1                                   // Se Conseguir executar o bloco try com sucesso quantidadeVotos recebe 1
    } catch (e: IllegalVoterException) { 0 }// Senão lança exeção e retorna 0

    quantidadeVotos += try {
        vote("Maria", 13)
        1
    } catch (e: IllegalVoterException) { 0 }

    quantidadeVotos += try {
        vote("João", 33)
        1
    } catch (e: IllegalVoterException) { 0 }

    println(quantidadeVotos)
}