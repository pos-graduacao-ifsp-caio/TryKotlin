package br.com.caiomorceli.trykotlin

fun main() {
    var numString: String = 10.toString()
    val numDouble: Double = numString.toDouble()
    val numFloat: Float = numDouble.toFloat()
    val numInt: Int = numFloat.toInt()

    println(numInt.toString())

    // Cast AS
    val any: Any = "Any equivale a Object em Java"
    // val string: String = any as String

    if(any is String) {
        println("${any} é uma string")
    }
}