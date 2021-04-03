package oo
// atenção ao valor default em price
class House(var height: Double, val color: String, val price: Int = 50000) {
    fun print() {
        println("House [height=$height, color=$color, price=$price]")
    }
}

fun main() {
    val house = House(4.5, "Blue", 150000)
    val redHouse = House(color = "Red", price = 200000, height = 5.0)
    val yellowHouse = House(color = "Yellow", height = 2.5)

    house.print()
    redHouse.print()
    yellowHouse.print()
}