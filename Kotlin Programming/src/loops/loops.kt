package loops

fun main() {
    outer@ for (i in 1..10) {
        inner@ for (j in 1..10) {
            if (i - j == 5) {
                break@outer
                //neste caso irá fazer skip ou inner loop
            }
            println("$i - $j")
        }
    }
}