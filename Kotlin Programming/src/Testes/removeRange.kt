package Testes

fun main() {
    var testString = "1+2"
    val operadorIndex = testString.indexOf("+")
    println(operadorIndex)
    println(testString[operadorIndex - 1].toInt())
    println(testString[operadorIndex - 1])
    println(testString[operadorIndex + 1].toInt())
    println(testString[operadorIndex + 1])

    val valorFinal = testString[operadorIndex - 1].toString().toInt() + testString[operadorIndex + 1].toString().toInt()
    println(valorFinal)

    testString = testString.removeRange(operadorIndex - 1, operadorIndex + 2)
    println("Test String $testString")
}