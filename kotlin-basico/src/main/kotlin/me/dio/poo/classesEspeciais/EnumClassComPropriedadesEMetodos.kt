package me.dio.poo.classesEspeciais

// Enums podem conter propriedades e métodos como outras classes, separados da lista de constantes enum por ponto e vírgula.

enum class Color(val rgb: Int) {                      // Define uma classe enum com uma propriedade e um método.
    RED(0xFF0000),                                // Cada constante enum deve passar um argumento para o parâmetro do construtor.
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // Os membros da classe Enum são separados das definições constantes por ponto e vírgula.
}

fun main() {
    val red = Color.RED
    println(red)                                      // O padrão toString retorna o nome da constante, aqui "RED".
    println(red.containsRed())                        // Chama um método em uma constante enum.
    println(Color.BLUE.containsRed())                 // Chama um método por meio do nome da classe enum.
    println(Color.YELLOW.containsRed())               // Os valores RGB de RED e YELLOW compartilham os primeiros bits ( FF) então isso imprime 'verdadeiro'.
}