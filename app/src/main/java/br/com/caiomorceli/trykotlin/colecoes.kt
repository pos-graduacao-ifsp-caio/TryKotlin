package br.com.caiomorceli.trykotlin

fun main() {
    // List e MutableList   (List é imutável não funciona dar add  nem remove).
    var familia: List<String> = listOf<String>("Caio", "Ana", "Paula", "Rosa")

    familia = listOf("Joao", "Carlos", "Zeca")
    // familia.add("maisum")  Dá erro porque a lista é imutável

    // Percorrendo usando FOR
    for(familiar in familia){
        println(familiar)
    }

    val listaInteiros: List<Int> = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // val listaInteiros: List<Int> = (1..10).toList()   converte de intRange para List.

    // Percorrendo usando IntRange
    for(numero in 0..9){
        println(listaInteiros[numero])
    }

    // listaInteiros.add(11)  dá erro. É imutável a lista.

    // 1..3..5..7..9
    val listaInteiros2: List<Int> = (1..10 step 2).toList()

    // Percorrendo usando IntRange
    for(numero in 0..listaInteiros2.size - 1){
        println(listaInteiros2[numero])
    }


    val listaCursos: MutableList<String> = mutableListOf<String>("Sistemas para Dispositivos Móveis", "Análise e Des. de Sistemas")

    // Quando a lista é mutável é possível alterá-la.
    listaCursos.add("Técnico em Informática para Internet")

    // Percorrendo a lista utilizando lambda
                // it   é o item atual que está sendo percorrido dentro do foreach.
    listaCursos.forEach({ println(it)})
    // listaCursos.forEach { println(it)}  outra forma de fazer.


    // Exercício da aula para entrega
    val listaCursosExercicio: MutableList<String> = mutableListOf("Sistemas para Dispositivos Móveis", "Análise e des. de Sistemas")
    val listaCursosSistemas: MutableList<String> = mutableListOf()

    listaCursosExercicio.add("Técnico  em Informática para Internet")
    listaCursosExercicio.add("Manutenção de Aeronaves")
    listaCursosExercicio.add("Técnico em Células")
    listaCursosExercicio.add("Processos Gerenciais")

    var i: Int = 0
    for(curso in listaCursosExercicio){
        if(curso.contains("Sistemas")){
            //listaCursosSistemas.add("${i} - ${curso}")
            listaCursosSistemas.add(curso)
            i++
        }
    }

    //listaCursosSistemas.forEach({ println(it)})

    // outra forma de fazer
    /*
    for(i in 0..listaCursosSistemas.size -1){
        println("${i} - ${listaCursosSistemas[i]}")
    }           */

    /*
    //Outra solução.
    fun imprime(ci: IndexedValue<String>) {
        println("${ci.index} - ${ci.value}")}
    }       */

    // Outra solução
                    // retorna uma lista com todos os itens que contem Sistemas no nome.
    val listaCursosSistemas2 = listaCursosExercicio.filter { it.contains("Sistemas") }

    // Utilizando lambda
    listaCursosSistemas2.withIndex().forEach({println("${it.index} - ${it.value}")})


    // outra Solução
    var funcao = fun(ci: IndexedValue<String>){
        println("${ci.index} - ${ci.value}")
    }

    var g: (IndexedValue<String>) -> Unit
    g = funcao

    val listaCursosSistemas3 = listaCursos.filter { it.contains("Sistemas") }
    listaCursosSistemas3.withIndex().forEach(g)
    // ---------------------------------------------------------------------------------

    println("Set e MutableSet")
    // O set não permite a inserção de dois elementos iguais na lista.
    val setCursos: MutableSet<String> = mutableSetOf<String>("ADS", "SDM", "TII")
    setCursos.add("ADS")  // nao será impresso
    setCursos.add("SDM")  // nao será impresso
    setCursos.add("TMA")

    setCursos.forEach { println(it) }

    println()
    println("Map e MutableMap")
                                                 // recebe objetos Pairs  como parâmetro .
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai", "Pedro"), Pair("Mãe", "Marcela"))
    familiaMap.put("Filho", "João")
    familiaMap.put("Caçula", "Cadu")
    familiaMap.put("Pet", "Paçoca")

    // Imprimindo o map
    // Solução 1
    for(chave in familiaMap.keys){
        println("${chave}: ${familiaMap.get(chave)}")
    }

    // Solução 2
    familiaMap.keys.forEach { println("${it}: ${familiaMap.get(it)}") }

    // Solução 3
    fun percorrerMap(par: Map.Entry<String, String>){
        println("${par.key}: ${par.value}")
    }
    familiaMap.forEach(::percorrerMap) // para passar a funcao por parametro se coloca  '::'  antes

    // Solução 4 :
    val percorreMap : (String, String) -> Unit = fun (k: String, v: String){
        println("${k}: ${v}")
    }
    familiaMap.forEach(percorreMap)

    // Solução 6
    familiaMap.forEach { println("${it.key}: ${it.value}") }

    // Solução 5
    familiaMap.forEach { println("${it.key}: ${it.value}") }
}