package Testes

import java.math.BigDecimal

fun main() {
    val input = listOf("1", "-", "1", "*", "2", "+", "3")
    val calcularInput = input.toMutableList()
    var operacao: String
    var indexOperacao = 0

    var valor1: BigDecimal
    var valor2: BigDecimal
    var valorOperacao: BigDecimal
    while (calcularInput.size > 1) {
        while (calcularInput.contains("*") || calcularInput.contains("/")) {
            indexOperacao = when (calcularInput.indexOf("*") > calcularInput.indexOf("/")){
                true -> calcularInput.indexOf("*")
                false -> calcularInput.indexOf("/")
            }
            operacao = calcularInput[indexOperacao]
            valor1 = calcularInput[indexOperacao - 1].toBigDecimal()
            valor2 = calcularInput[indexOperacao + 1].toBigDecimal()
            valorOperacao = when (operacao == "*") {
                true -> valor1 * valor2
                false -> valor1 / valor2
            }
            println("Valor1 = $valor1 $operacao Valor2 = $valor2 valorOperacao = $valorOperacao")

            println("Antes de remover $calcularInput")
            calcularInput[indexOperacao - 1] = valorOperacao.toString()
            calcularInput.removeAt(indexOperacao)
            calcularInput.removeAt(indexOperacao)
            println("Depois de remover $calcularInput")
        }

        while (calcularInput.contains("+") || calcularInput.contains("-")) {
            indexOperacao = when (calcularInput.indexOf("+") > calcularInput.indexOf("-")){
                true -> calcularInput.indexOf("+")
                false -> calcularInput.indexOf("-")
            }

            operacao = calcularInput[indexOperacao]
            valor1 = calcularInput[indexOperacao - 1].toBigDecimal()
            valor2 = calcularInput[indexOperacao + 1].toBigDecimal()
            valorOperacao = when (operacao == "+") {
                true -> valor1 + valor2
                false -> valor1 - valor2
            }
            println("Valor 1 = $valor1 $operacao por Valor 2 = $valor2 valorOperacao = $valorOperacao")

            println("Antes de remover $calcularInput")
            calcularInput[indexOperacao - 1] = valorOperacao.toString()
            calcularInput.removeAt(indexOperacao)
            calcularInput.removeAt(indexOperacao)
            println("Depois de remover $calcularInput")
        }
        println("${input.joinToString(" ")} = ${calcularInput.joinToString()}")
    }
}
