fun countVowels(word: String): Int {
    var count = 0
    val vowels = "aeiouy"

    val lowerword = word.lowercase()

    for (char in lowerword) {
        if (char in vowels) {
            count++
        }
    }
    return count
}

fun main() {
    println(countVowels("Programowanie"))
}