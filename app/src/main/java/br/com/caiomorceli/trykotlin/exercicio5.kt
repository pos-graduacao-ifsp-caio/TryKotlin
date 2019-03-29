package br.com.caiomorceli.trykotlin

// Exercício 5

fun processaInteiros(i: Int, funcao: (j: Int) -> Int): Int{
    return funcao(i)
}

fun processaInteiros(i: Int, j:Int, funcao: (Int, Int) -> Int): Int{
    return funcao(i, j)
}

//Funções
fun somar(i: Int, j: Int) = i + j
fun multiplicar(i: Int, j: Int) = i * j

fun raizQuadrada(numero: Int): Int{
    for(num in 1..numero){
        if(num * num == numero)
            return num
    }

    return -1
}

fun main() {
    var resultado = processaInteiros(15, 15, ::somar)
    println(resultado)
    resultado= processaInteiros(15, 15, ::multiplicar)
    println(resultado)
    resultado = processaInteiros(15, ::raizQuadrada)
    println(resultado)

    resultado = processaInteiros(15, 15) {x, y -> x + y}
    resultado = processaInteiros(15, 15) {x, y -> x * y}
    resultado = processaInteiros(15) {
        for(num in 1..it){
            if(num * num == it){
               return@processaInteiros num
            }
        }
        
        return@processaInteiros -1
    }



}