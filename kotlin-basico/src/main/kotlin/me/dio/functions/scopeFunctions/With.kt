package me.dio.functions.scopeFunctions

/*
    with é uma função sem extensão que pode acessar membros de seu argumento de forma concisa:
    você pode omitir o nome da instância ao se referir a seus membros.
*/

class Configuration(var host: String, var port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)


    with(configuration) {
        println("$host:$port")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")

}