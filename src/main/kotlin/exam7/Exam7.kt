package exam7

fun main() {
    // val ages = mapOf("Peter" to 24, "Clark" to 31)
    val ages = mutableMapOf("Peter" to 24, "Clark" to 31)

    ages.put("Alice", 29)

    for((key, value) in ages) {
        println("$key is $value years old")
    }
}