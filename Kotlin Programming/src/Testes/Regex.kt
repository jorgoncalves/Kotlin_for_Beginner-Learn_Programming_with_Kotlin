package Testes

fun main() {
    val regexNumbers = "(\\-|\\+|\\/|\\*)".toRegex()
    val regexOperators = "(\\d*\\.?\\d+|\\d*\\.?\\d+)".toRegex()
//    val regexOperatorsCapture[]  = arrayListOf("+", "-", "*", "/")
    val testRegex = "15+9-4*2"
    val numbers = testRegex.split(regexNumbers)
    val operators = testRegex.split(regexOperators)
    val complete = "12+98*71".split(("+"), ("-"), ("*"), ("/"))
    println("Numbers $numbers")
    println("Operators $operators")
    println("Complete $complete")

}