package collections

fun main() {
    // Pair cria objetos
    val namesToAges = mapOf(Pair("Peter", 24), Pair("Roger", 42))
    // Outro tipo de notação para criação de mapas
    // to é infix (também existe o método .to("parametro"))
    val namesToAges2 = mapOf(
        "Peter" to 24,
        "Roger" to 42
    )

    println(namesToAges == namesToAges2)

    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countrytoInhabitants = mutableMapOf(
        "Germany" to 80_000_000,
        "USA" to 300_000_000
    )
    // no caso de ser igual(a key) .put subescreve
    countrytoInhabitants.put("Australia", 23_000_000)
    // apenas irá acrescentar se não existir
    countrytoInhabitants.putIfAbsent("USA", 320_000_000)

    println(countrytoInhabitants)

    println(countrytoInhabitants.contains("Australia"))
    println(countrytoInhabitants.containsKey("France"))
    println(countrytoInhabitants.containsValue(20_000_000))

    // .get, retorna o valor guardado na chave
    println(countrytoInhabitants.get("Germany"))
    // na ausencia, podemos definir um valor default
    println(countrytoInhabitants.getOrDefault("France", 0))

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value}")
    }
}