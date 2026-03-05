fun isPerfect(number: Int): String {
    var sum = 0

    for (i in 1 until number) {
        if (number % i == 0) {
            sum += i
        }
    }
    return when {
        sum == number -> "perfect"
        sum > number -> "abundant"
        else -> "deficient"
    }
}

fun main() {
    println(isPerfect(28))
    println(isPerfect(12))
    println(isPerfect(8))
}