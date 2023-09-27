package me.dio.nullsafety

fun main() {

    var neverNull: String = "This can't be null"            // Uma variavel inicializada como String não pode receber um valor nulo
   // neverNull = null

    var nullable: String? = "You can keep a null here"      // Para atribuir um valor nulo a uma String devemos usar ?
    nullable = null                                         // como no exemplo String?

    var inferredNonNull = "The compiler assumes non-null"

   // inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
   // strLength(nullable)

    println(describeString(null))
    println(describeString(""))
    println(describeString("dio.me"))
}

fun describeString(maybeString: String?): String {          // Função para trabalhar com valores nulos
    if (maybeString != null && maybeString.length > 0) {    // Uma função que recebe uma string null e retorna sua descrição.
        return "String of length ${maybeString.length}"     // Se a string fornecida não estiver null || empty, retorne informações sobre seu comprimento.
    } else {
        return "Empty or null string"                       // Caso contrário, informa que a string está vazia ou nula.
    }
}