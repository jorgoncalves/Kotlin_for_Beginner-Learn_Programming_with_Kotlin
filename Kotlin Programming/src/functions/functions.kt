package functions

import java.util.*

// No parameters, no return value
fun helloWorld() {
    println("Hello World!")
}

// "Kotlin" -> "K o t l i n "
// ! parameter, no return value
fun printWithSpaces(text: String){
    for (char in text) {
        print ("$char ")
    }
    println()
}
// em funções que retornam um valor temos que especificar o tipo de dados
// No parameters, returns Data
fun  getCurrentDate(): Date {
    return Date()
}

// 2 parameters, return Int
fun max(a : Int, b: Int): Int {
    if ( a >= b) {
        return a
    }else {
        return b
    }

}

fun main() {
    helloWorld()
    printWithSpaces("Kotlin")
    println(getCurrentDate())
    println(max(17, 42))
}