data class Point(val x: Int, val y: Int) {

    operator fun plus(other: Point): Point {
        return Point(this.x + other.x, this.y + other.y)
    }

    operator fun plus(scalar: Int): Point {
        return Point(this.x + scalar, this.y + scalar)
    }

    operator fun minus(other: Point): Point {
        return Point(this.x - other.x, this.y - other.y)
    }

    operator fun times(other: Point): Point {
        return Point(this.x * other.x, this.y * other.y)
    }

    operator fun inc(): Point {
        return Point(this.x + 1, this.y + 1)
    }

    operator fun dec(): Point {
        return Point(this.x - 1, this.y - 1)
    }

    operator fun not(): Point {
        return Point(-this.x, -this.y)
    }

}

fun main() {
    var p1 = Point(1, 1)
    val p2 = Point(2, 2)

    println("p1 + p2 = ${p1 + p2}")

    p1 += 1
    println("p1 += 1 $p1")

    p1 = Point(1, 1)
    println("p1 - p2 = ${p1 - p2}")
    println("p1 * p2 = ${p1 * p2}")

    p1++
    println("p1++ = $p1")

    p1 = Point(1, 1)
    p1--
    println("p1-- = $p1")

    p1 = Point(1, 1)
    println("!p1 = ${!p1}")
}