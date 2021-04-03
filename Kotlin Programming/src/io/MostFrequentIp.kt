package io

import java.io.File

fun main() {
    val ipToCount = mutableMapOf<String, Int>()
    File("../ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous + 1)
//        if (ipToCount.contains(it)) {
//            val previous = ipToCount.get(it)!!
//            ipToCount.put(it, previous + 1)
//        } else {
//            ipToCount.put(it, 1)
//        }
    }
    // permite procurar qual é o numero maximo de ocorrencias
    // acedemos a todas as entradas(entries) e maxBy retorna apenas o que ocorre mais vezes
    val (maxIp, maxCount) = ipToCount.entries.maxBy { it.value }!!
//    var maxIp = ipToCount.keys.first()
//    var maxCount = 0
//    //podemos deconstruir no key value pair
//    for ((ip, count) in ipToCount.entries) {
//        if (count > maxCount) {
//            maxCount = count
//            maxIp = ip
//        }
//    }
    println("Most frequent IP adress is $maxIp, which occurred $maxCount times.")
}