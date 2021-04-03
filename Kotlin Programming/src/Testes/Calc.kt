package Testes

fun main() {
    val numeros = mutableListOf(1, 2)
    val operadores = mutableListOf("+")
    var valorFinal: Int = 0

    var i = 0
    var n = 0

    while (n < operadores.count()) {
        if (n == 0) {

            when (operadores[n]) {
                "+" -> valorFinal = numeros[i] + numeros[i + 1]
                "*" -> valorFinal = numeros[i] * numeros[i + 1]
            }
            n++
            i = 2
            println("n=$n i=$i")
            println("Numeros $numeros")
            println("Operadores $operadores")
            println("Valor final $valorFinal")
        } else {
            when (operadores[n]) {
                "+" -> valorFinal = valorFinal + numeros[i]
                "*" -> valorFinal = valorFinal * numeros[i]
            }
            n++
            i++
            println("n=$n i=$i")
            println("Numeros Else $numeros")
            println("Operadores Else $operadores")
            println("Valor final Else $valorFinal")
        }
    }
}


