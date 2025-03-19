package exam11

fun String.greet() {
    println("hello, $this ~!") // this는 자기 자신
}

fun List<Int>.square(): List<Int> {
    val rst = this.map{ it * it }
    return rst
}

fun main() {
    val name: String = "Alice"

    name.greet()

    val intList = listOf(1, 2, 3, 4, 5)

    val rst = intList.average()
    println(rst)

    val squaredIntList = intList.square()
    println("====================\n")
    squaredIntList.forEach{println(it)}
}