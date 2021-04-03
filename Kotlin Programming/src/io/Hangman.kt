package io

fun main() {
    println("Enter the word to guess: ")
    val word: String? = readLine()

    if (word == null) {
        println("No word given, game ended.")
        return
    }

    for (i in 1..100) {
        println()
    }
    // normalização
    // ao converter para HashSet, são retiradas os duplicadas da array
    // Tree
    // tree
    // ['t','r','e','e']
    // {'t','r','e'}
    val letter = word.toLowerCase().toCharArray().toHashSet()
    // mutable significa que se pode acrescentar novos elementos ao set
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letter != correctGuesses) {
        printExploredWord(word, correctGuesses)
        println("#Wrong guesses: $fails")

        print("Guess a letter: ")
        val input = readLine()

        if (input == null) {
            continue
        } else if ( input.length != 1) {
            println("Please enter one letter")
            continue
        }
        if (word.toLowerCase().contains(input.toLowerCase())){
            correctGuesses.add(input[0].toLowerCase())
        } else{
            fails++
        }

    }

    printExploredWord(word, correctGuesses)
    println("\n#Wrong guesses: $fails\n")
    println("Well done!")


}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for (character in word.toLowerCase()) {
        if (correctGuesses.contains(character)) {
            print("$character ")
        } else {
            print("_ ")
        }
    }
}