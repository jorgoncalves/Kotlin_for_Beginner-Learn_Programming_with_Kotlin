package Testes

fun main() {
    println(dividir(12, 0))
}

fun dividir(vararg valor: Int): String {

      when(valor[0] == 0 && valor[1] == 0){
          true -> return "Certo"
          false -> return "Errado"
      }
//    when(valor){
//        valor[0] is zero, 0 -> return "Certo"
//        else -> return "Errado"
//    }
}