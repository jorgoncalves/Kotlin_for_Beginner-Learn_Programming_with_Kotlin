package Testes

fun main() {
    val list = mutableListOf("3", "+", "8")
    val listIterator = list.listIterator()
    println("List Iterator $listIterator")
    while (listIterator.hasNext()) {
        val value = listIterator.next()
        if (value == "+") {
            val indexAnterior = listIterator.previousIndex() - 1
            val indexSeguinte = listIterator.nextIndex()
            val anterior = list[indexAnterior]
            val seguinte = list[indexSeguinte]
            println("Anterior $anterior index $indexAnterior, Seguinte $seguinte index $indexSeguinte")
            val valorOperacao = anterior.toInt() + seguinte.toInt()
            println("Valor operacao $valorOperacao")
            listIterator.set(valorOperacao.toString())
            println("List $list")
            println("List Iterator $listIterator")
        }
    }
}