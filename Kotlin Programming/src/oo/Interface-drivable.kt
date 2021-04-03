package oo


interface Driveable {
    fun drive()

}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: Color) : Driveable, Buildable {
    override val timeRequired: Int = 120

    override fun drive() {
        println("Driving car...")
    }

    override fun build() {

        println("Built a shiny car.")
    }
}

class MotorCycle(val color: String) : Driveable {
    override fun drive() {
        println("Driving motorcycle...")
    }
}

fun main() {
    val car = Car(Color.GREEN)
    println(car.color)
    val motorCycle: Driveable = MotorCycle("red")
    motorCycle.drive()
}
