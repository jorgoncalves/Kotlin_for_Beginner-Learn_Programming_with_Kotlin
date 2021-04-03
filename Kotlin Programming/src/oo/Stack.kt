package oo

// DRY = don't repeat yourself
// vararg permite adicionar quanto elementos de um tipo quisermos.
// não é necessario criar mais uma lista para passar mais que um elemento.
class Stack<E>(vararg val items: E) {

    val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

fun <T> stackOf(vararg elements: T): Stack<T> {
    // spread operatior * para converter elements (que esta em array) para elementos
    return Stack(*elements)
}

fun main() {
    val stack = Stack(3, 5, 2, 8)
    stack.push(11)

    val stack2 = stackOf("Hi", "Hey", "Hello")
    for (i in 1..3) {
        println(stack2.pop())
    }
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
}

