package io

import java.io.File

fun main() {
    var lineNumber = 0
    File("../inputfile.txt").forEachLine {
        // implicitamente, Kotlin irá chamar a cada linha it
        ++lineNumber
        println("#$lineNumber: $it")
    }
}