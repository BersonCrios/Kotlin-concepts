package br.com.bersoncrios

import java.lang.Exception

fun main(args: Array<String>){
    try {
        print("Digite um número: ")
        val num: Int = readLine()!!.toInt()
        val divisao: Int = 100/num
        println("A divisão é $divisao")
    }
    catch (e: Exception){
        println("Erro: ${e.message}")
    }
    finally {
        println("Programa Finalizado")
    }
}