fun suma(a: List<Int>): Int {
    return a.filter {it > 0}
        .reduce {acc, i -> acc + i}
    //  .fold(0) {acc, i -> acc + i} -- użycie fold jest bezpieczniejsze, bo w przypadku braku liczb dodatkich reduce zwróci nam błąd UnsupportedOperationException
}

fun main() {
    val input = listOf(1, -4, 12, 0, -3, 29, -150)
    println(suma(input))
}