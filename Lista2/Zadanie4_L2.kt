fun safeParseAndClassify(input: String?): String {
    return input?.toIntOrNull()?.let { liczba ->
        if (liczba% 2 == 0) {
            "PARZYSTA"
        } else {
            "NIEPARZYSTA"
        }
    } ?: "BRAK_DANYCH"
}

fun main() {
    println(safeParseAndClassify(null))
    println(safeParseAndClassify(""))
    println(safeParseAndClassify("abc"))
    println(safeParseAndClassify("4"))
    println(safeParseAndClassify("7"))
}