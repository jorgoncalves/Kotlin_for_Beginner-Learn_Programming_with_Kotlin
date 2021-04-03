package Testes

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.round

fun main() {
    var input: Double = 1.1


    val inputString: String = input.toString()
    val indexOfDecimal = inputString.indexOf(".")
    val inputInteger: String = inputString.substring(0, indexOfDecimal)
    val inputDecimal: String = inputString.substring(indexOfDecimal)
    val decimal: Boolean
    when (inputDecimal == ".0") {
        true -> decimal = true
        false -> decimal = false
    }


    var test:Double = 1.1 - 1
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING
    var valor = df.format(test.toDouble()).toString()
    println(valor)

    println("Input as Double: $input")
    println("Input as Integer: $inputInteger")
    println((input.toDouble() - inputInteger.toDouble()))
    println("Input as Decimal: $inputDecimal")
    println("Decimal is 0: $decimal")
}