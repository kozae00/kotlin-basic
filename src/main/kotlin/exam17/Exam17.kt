package exam17

fun main() {
    val names = listOf("Alice", "Bob", "Jack")

    names.map{
        "Hello, $it"
    }
        .forEach(::println)
}