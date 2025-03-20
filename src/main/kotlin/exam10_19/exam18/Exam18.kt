package exam10_19.exam18

fun main() {
    val name: String? = null
    val displayName: String = name ?: "Guest"

    println(displayName)
}