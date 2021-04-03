package Testes

fun main() {
    data class User (val nome: String, val idade: Int)

    var listUsers:ArrayList<User> = ArrayList()

    listUsers.add(User("Jorge", 29))

    println(listUsers)
}