package exam01_09.exam2

fun main() {
    var num = 15

    when {
        num % 2 == 0 -> println("짝수")
        num % 2 != 0 -> println("홀수")
        // else -> println("홀수")
    }
}