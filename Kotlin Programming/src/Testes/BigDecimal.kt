package Testes

import java.math.BigDecimal

fun main() {
//    val operacao = arrayListOf<String>("0","1","2")
//    var userInput = "0/"
//    val regex = "(\\-|\\+|\\/|\\*)".toRegex()
//    val testRegex = "1546+9-9."
//   fun changeLastOperation(valor: String) {
//
//        userInput = userInput.dropLast(1)
//        userInput += valor
//
//    }
//    println(userInput)
//    changeLastOperation("*")
//    println(userInput)
//
//    val numbers = testRegex.split(regex)
//    println(numbers)
//    println(numbers[numbers.lastIndex])
//    println(numbers[numbers.lastIndex].contains("."))
//
//    println("Negative Number")
//    val negativeNumber = "--"
//    println(negativeNumber.endsWith("-"))
//    println(negativeNumber[negativeNumber.lastIndex -1].toString() == "-")
//
//    println("Divide 0")
//    val divideZero = "1231+13123-0+".split(regex)
//    val last = divideZero[divideZero.lastIndex-1]
//    println(divideZero)
//    println(last)
//    println(last == "0")
    val calcularString = "1+2+1"
    var numeroOperacoes = calcularString
    var valorFinal: Any
    if (calcularString[calcularString.lastIndex].toString() == "-") {
        println("Acaba em -")
    } else {
        println("Operação Inicial $numeroOperacoes")
        println("Não acabada em -")
        while (numeroOperacoes.length > 1) {
            while (numeroOperacoes.contains("*") || numeroOperacoes.contains("/")) {
                for (operador in numeroOperacoes) {
                    if (operador.toString() == "*" || operador.toString() == "/") {
                        var indexOperador: Int = numeroOperacoes.indexOf(operador)
                        println("Index Operador $indexOperador")
                        println("Multiplicar ou Dividir")
                        valorFinal = when (operador.toString() == "*") {
                            true -> numeroOperacoes[indexOperador - 1].toInt() * numeroOperacoes[indexOperador + 1].toInt()
                            false -> numeroOperacoes[indexOperador - 1].toInt() / numeroOperacoes[indexOperador + 1].toInt()
                        }
                        numeroOperacoes.indexOf(valorFinal.toString(), indexOperador + 1)
                        numeroOperacoes.removeRange(indexOperador - 1, indexOperador)
                        println("String Operacão $numeroOperacoes")
                    }
                }
            }
            outer@ while (numeroOperacoes.contains("+") || numeroOperacoes.contains("-")) {
                inner@ for (operador in numeroOperacoes) {
                    if (operador.toString() == "+" || operador.toString() == "-") {
                        var indexOperador: Int = numeroOperacoes.indexOf(operador)
                        println("Index Operador $indexOperador")
                        println("Sumar ou Subtrair")
                        valorFinal = when (operador.toString() == "+") {
                            true -> numeroOperacoes[indexOperador - 1].toInt() + numeroOperacoes[indexOperador + 1].toInt()
                            false -> numeroOperacoes[indexOperador - 1].toInt() - numeroOperacoes[indexOperador + 1].toInt()
                        }
//                        numeroOperacoes[1] = valorFinal.toString()
                        numeroOperacoes.indexOf(valorFinal.toString(), indexOperador + 1)
                        numeroOperacoes.removeRange(indexOperador - 1, indexOperador)
                        println("String Operacão $numeroOperacoes")
                    }
                }
            }
        }
    }
}