fun <A> isSorted(lst: List<A>, order: (A, A) -> Boolean): Boolean {
    if (lst.size <= 1) {
        return true
    }

    for (i in 0 until lst.size - 1) {
        val obecny = lst[i]
        val nastepny = lst[i + 1]

        if (!order(obecny, nastepny)) {
            return false
        }
    }
    return true
}

fun main() {
    val test1 = isSorted(listOf(1, 2, 3, 4), {i: Int, j: Int -> i < j})
    println("Test 1: $test1")

    val test2 = isSorted(listOf(1, 1, 1, 1), {i: Int, j: Int -> i == j})
    println("Test 2: $test2")

    val test3 = isSorted(listOf("ahyyhh", "bkjn", "cnn", "duu"), {i: String, j: String -> i.first() < j.first()})
    println("Test 3: $test3")
}