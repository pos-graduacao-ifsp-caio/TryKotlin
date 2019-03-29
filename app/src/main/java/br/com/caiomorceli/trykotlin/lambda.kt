package br.com.caiomorceli.trykotlin

fun processaInteiro(i: Int, funcao: (j: Int) -> Int): Int{
    return funcao(i)
}

fun inverte(x: Int): Int = x * -1

fun Int.executa(funcao: (Int) -> Int): Int{
    return funcao(this)
}

fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String): String = "${i}${j}"

fun foo(x: Int, y: Int, funcao: (x: Int, y: Int) -> Int): Int = funcao(x,y)

fun bar(s: String, st: String, funcao: (s: String, st: String) -> String): String = funcao(s, st)

fun <T, U> xpto(x: T, y: U, funcao: (T, U) -> T): T = funcao(x, y)

fun main() {
    //Passando uma função comum como parâmetro
    val n: Int = processaInteiro(10, ::inverte)
    println(n)

    //Passando uma função lambda como parâmetro
    val n2: Int = processaInteiro(11, {x: Int -> -1 * x})
    // val n2: Int = processaInteiro(11, {x -> -1 * x})  // funciona assim tbm.
    println(n2)

    //Passando uma função lambda como parâmetro, com um parâmetro apenas
                    // o it  se refere ao parâmetro que chega nesta função.
    val n3: Int = processaInteiro(12, {-1 * it})
    println(n3)

    //Passando uma função lambda como último parâmetro.
    // o it  se refere ao parâmetro que chega nesta função.
    val n4: Int = processaInteiro(13) {-1 * it}
    println(n4)

    //Passando lambda para uma função estendida.
    val n5: Int = 14.executa() {-1 * it }
    println(n5)

    //Passando lambda para uma função estendida.
    var n6: Int = 14.executa {-1 * it }
    n6 = 15.executa {-1 * it }
    println(n6)

    // Atribuindo uma lambda a uma variável.
    val funcaoLambda: (Int) -> Int = {x -> -1 * x}
    val n7: Int = processaInteiro(16, funcaoLambda)
    println(n7)

    // Atribuindo uma lambda a uma variável.
    val funcaoLambda2 = {x: Int -> -1 * x}
    val n8: Int = processaInteiro(16, funcaoLambda)

    // Exercício 3
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))

    println(xpto(2, 3, ::soma))
    println(xpto("Jo", "ão", ::cat))


}