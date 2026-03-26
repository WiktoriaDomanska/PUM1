fun check(n: Int, list: List <Int>): Int {
    val okienka = list.windowed(n + 1)

    for (okno in okienka) {
        val cel = okno.last()
        val preambula = okno.take(n)

        var maPare = false

        for (i in 0 until n) {
            for (j in i + 1 until n ) {
                if (preambula[i] + preambula[j] == cel) {
                    maPare = true
                }
            }
        }

        if (maPare == false) {
            return cel
        }
    }
    return -1
}

fun main() {
    val list1 = listOf(1, 2, 3, 5, 7, 12, 30)
    println("Test 1: ${check(3, list1)}")

    val list2 = listOf(1, 2, 3, 4, 5, 6)
    println("Test 2: ${check(2, list2)}")

    val list3 = listOf(35, 25, 15, 25, 47, 40, 62, 55, 65, 95, 102, 117, 150, 182, 127, 219, 299, 277, 309, 576)
    println("Test 3: ${check(5, list3)}")
}