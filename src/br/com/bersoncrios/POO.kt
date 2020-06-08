package br.com.bersoncrios

interface Dirigivel{
    fun acelerar(velocidade: Long)
}
interface Carregavel{
    fun carregar(quantidade: Int)
}

open class Veiculo(open var cor: String,open var ano: Int,open var modelo: String){

    init {
        println("Contruindo um ${modelo}")
    }
}

class Carro(override var cor: String,override var ano: Int,override var modelo: String) :
        Veiculo(cor,ano,modelo), Dirigivel{
    fun abrirPorta(){
        println("Abrindo a porta do ${modelo}")
    }

    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a ${velocidade}Km/h")
    }
}

class Caminhao(override var cor: String,override var ano: Int,override var modelo: String, var capacidade: Long) :
        Veiculo(cor,ano,modelo),Dirigivel, Carregavel{
    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a ${velocidade}Km/h")
    }

    override fun carregar(quantidade: Int) {
        println("Carregando o $modelo com ${quantidade} toneladas")
    }

}

data class Livro(
        val titulo: String,
        val autor: String,
        val ano: Int
)

fun main(){
    val uno = Carro("Vermelho", 2020, "Uno")
    println("Carro: Cor ${uno.cor}, Modelo ${uno.modelo}, Ano ${uno.ano}")
//    uno.abrirPorta()
    uno.acelerar(100)
    val scania = Caminhao("Branco", 2015, "XPTO", 120)
    println("Carro: Cor ${scania.cor}, Modelo ${scania.modelo}, Ano ${scania.ano}, Capacidade ${scania.capacidade}")
    scania.acelerar(50)
    scania.carregar(3)




    val livro = Livro("Android Pro", "Guilherme", 2017)
    print(livro)
}