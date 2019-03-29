package br.com.caiomorceli.trykotlin

fun main(){
    //String com tipo explícito
    var nome: String = "Caio"

    // Tipo determinado implicitamente
    var sobrenome = "Morceli"

    //var e val podem ser inicializados depois também.
    var nomeMeio: String
    nomeMeio = "Lazarini"

    //Float
    var altura: Float = 1.80f
    // var altura2: Float = 1.74.toFloat()   usando o método toFloat do objeto também funcionaria.

    //Inteiro
    var idade: Int = 26

    // convertendo de inteiro para double.  O kotlin exige que a conversão seja feita de forma explícita.
    var peso: Double = 81.toDouble()

    println("Nome :${nome} ${nomeMeio} ${sobrenome}, altura: ${altura}, idade: ${idade} e peso: ${peso}")
}