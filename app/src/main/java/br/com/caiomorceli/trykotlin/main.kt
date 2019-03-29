package br.com.caiomorceli.trykotlin

// args: Array<String> deixou de ser obrigatório na versão 1.3
fun main() {
    // Declaração de variável mutável
    var frase: String = "Hello World!"

    frase = "Hello, IFSP!"


    // Imprime no console a variável na tela
    println(frase)

    // Imprimindo String Template
    println("$frase")
    println("${frase}")

    // Imprimindo com a chamada de função
    println("Quantidade de caracteres: ${frase.count()}")

    // Com propriedade (get)
    println("Quantidade de caracteres: ${frase.length}")

    // frase.length = 10   por baixo dos panos o kotlin chama o método set(do java) para alterar o valor da propriedade.
}