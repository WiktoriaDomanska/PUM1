fun perm(list: List<Int>): List<List<Int>> {
    if (list.size <= 1) return listOf(list)

    return list.indices.flatMap { i ->
        val current = list[i]
        val remaining = list.filterIndexed { index, _ -> index != i }
        perm(remaining).map { permutedRest ->
            listOf(current) + permutedRest
        }
    }
}

fun main() {
    val input = listOf(1, 2, 3)
    println(perm(input))
}