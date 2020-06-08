package br.com.bersoncrios

import java.util.*

fun main() {
//    var opcao: Int = 1
//
//    when (opcao){
//        1 -> print("CC")
//        2 -> print("CD")
//        3 -> print("CI")
//
//        else -> {
//            print("Nenhuma acima")
//            print("Fale com nossos atendentes")
//        }
//    }


//    for (item in 1..20){
//        println("Item:  $item")
//    }

//    var array = arrayOf("SP", "RJ", "PR")
//
//    println(array[1])
//
//    for (estado in array){
//        println("Estado $estado")
//    }

    olaMundo()
    println(queHorasSao())
    println(soma(10, 120))
}

fun soma(a: Int, b: Int):Int{
    return a+b
}

fun queHorasSao(): Date{
    return Date()
}

fun olaMundo(){
    println("Olá Mundo")
}