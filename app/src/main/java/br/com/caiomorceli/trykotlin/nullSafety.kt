package br.com.caiomorceli.trykotlin

fun main(){
    var nome: String
    // nome = null   nao pode ser declarado como null no kotlin

    var sobrenome: String?  // para indicar que a variável pode ser nula.
    sobrenome = null

    var sobrenome2: String
    sobrenome2 = sobrenome?: "Morceli"

    //println(sobrenome.capitalize())
    //println(sobrenome.length)

    if(sobrenome != null){   // se fizer uma validacao para ver se nao é nulo  então o compilador não irá mais dar erro.
        println(sobrenome.capitalize())
        println(sobrenome.length)
    }

    println(sobrenome?.capitalize())  // caso a variável seja nula  é impresso nulo no console
    println(sobrenome?.length)       // caso a variável seja nula  é impresso nulo no console

    try {
        println(sobrenome!!.capitalize())  // o programador assume o risco da variável poder ser nula
        println(sobrenome!!.length)       // o programador assume o risco da variável poder ser nula
    }   catch (kne: KotlinNullPointerException){
        println("Deu exceção!")
    }
}