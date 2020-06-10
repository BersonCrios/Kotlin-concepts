package br.com.bersoncrios

enum class Direcao{
    NORTE,
    SUL,
    LESTE,
    OESTE
}


fun main(args: Array<String>){
    //ARRAY LIST
    var array = arrayListOf("João", "Maria", "Felipe")
    array.add("Jaqueline")
    println(array)
    array.remove("João")
    println(array)
    println(array.size)
    println(array.isEmpty())
    println(array.contains("GUilherme"))
    for (name in array){
        println(name)
    }

    //HASH SET
    var set = hashSetOf(1,2,4,4,60,60,70)
    set.remove(70)
    set.add(100)
    for (num in set){
        println(num)
    }

    //MAP
    var map = hashMapOf("chave1" to 1, "chave2" to 2, "chave3" to 3 )
    map.put("chave4", 4)

    for (chave in map.keys){
        println("$chave: ${map.get(chave)}")
    }

    //ENUMERADORES
    var direcao: Direcao = Direcao.OESTE

    println(direcao)
}