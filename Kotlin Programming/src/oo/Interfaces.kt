package oo

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course.")
    }
}
interface Learnable{
    fun learn() {
        println("Learning...")
    }
}

open class KotlinCourse() : Course("Kotling", 999.99), Learnable {
    final override fun learn() {
        super<Course>.learn()
        println("I'm one of the first people to learn Kotlin!")
    }
}

fun main(){
    val course = KotlinCourse()
    course.learn()
}