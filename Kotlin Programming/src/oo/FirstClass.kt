package oo


// no Kotlin não precisamos de inicializar as propriedades como no Java
// para evitar o boilerplate code, inicializa-se diretamente na declaração da class
abstract class Person(open val name: String, open var age: Int) {

    //apenas será chamado quando o objeto for criado
    init {
        println("Object was created")
    }

    abstract fun speak()

    //neste caso irá se referir ao name local(refere-se sempre a scope mais próxima
    fun greet(name: String) {
        println("Hello $name!!")
    }

    fun getYearOfBirth() = 2019 - age
}

class Student(override val name: String, override var age: Int, val studentID: Long) : Person(name, age) {

    fun isIntelligent() = true
    override fun speak() {
        println("Hi there, I'm a student!")
    }
}

class Employee(override val name: String, override var age: Int) : Person(name, age) {
    fun receivePayment() {
        println("Received payment.")
    }

    override fun speak() {
        println("Hi I'm an employee!")
    }
}

fun main() {
    val student = Student("John", 25, 3647284)
    student.speak()
    println(student.isIntelligent())

    val employee = Employee("Mary", 32)
    employee.speak()
    println(employee.getYearOfBirth())
    employee.receivePayment()
}