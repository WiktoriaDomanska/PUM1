fun checkArmstrong(number: Int): Boolean {
    val strNum = number.toString()
    val power = strNum.length

    var sum = 0

    for (char in strNum) {
        var digit = char.digitToInt()

        var resultOfPower = 1
        for (i in 1..power) {
            resultOfPower *= digit
        }
        sum += resultOfPower
    }
    return number == sum
}

fun main() {
    println(checkArmstrong(153))
}