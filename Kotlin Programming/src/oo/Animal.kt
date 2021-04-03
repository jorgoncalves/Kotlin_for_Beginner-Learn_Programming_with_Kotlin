package oo

open class Animal {
    var age: Int = 0
    protected  var name = "Sam"
    internal val isDangerous = true
    public fun isOld(): Boolean {
        return age > 12
    }
}

class Vertebrate : Animal() {
    fun introduceYourself () {
        println(this.name)
    }
}

fun main() {

    val animal = Animal()
    // val's têm apenas Getter's porque não se pode redifinir a variável
    // não acede diretamente à propriedade
    // internamente chama o setter do Kotlin
    animal.age = 8
    // internamente chama o getter do Kotlin
    println(animal.age)
}