fun addToBoolean(): Map<Int, Boolean> {
    val resultMap = mutableMapOf<Int, Boolean>()

    for (i in 1..20) {
        if (i % 2 == 0) {
            resultMap[i] = true
        } else {
            resultMap[i] = false
        }
    }
    return resultMap
}

fun main() {
    println(addToBoolean())
}