fun printPascal(height: Int): String {
    var result = ""

    for (row in 0 until height) {
        for (space in 0 until height - row) {
            result += " "
        }

        var number = 1
        for (col in 0..row) {
            result += "$number "
            number = number * (row - col) / (col + 1)
        }
        result += "\n"
    }
    return result
}

fun main() {
    println(printPascal(4))
}