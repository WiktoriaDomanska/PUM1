val <T> List<T>.head: T
    get() = this[0]

val <T> List<T>.tail: List<T>
    get() = this.drop(1)

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println("Lista: $numbers")
    println("Głowa (head) - pierwszy element listy: ${numbers.head}")
    println("Ogon (tail) - wszystkie elementy oprócz pierwszego: ${numbers.tail}")

    val words = listOf("Pum", "Programowanie", "Urządzeń", "Moblinych")
    println("\nGłowa słów: ${words.head}")
    println("Ogon słów: ${words.tail}")
}