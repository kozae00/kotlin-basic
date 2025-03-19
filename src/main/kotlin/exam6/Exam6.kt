package exam6

fun main() {
    // val names = listOf("Alice", "Bob", "Charlie") // listOf는 변경 불가능한 리스트
    val names = mutableListOf("Alice", "Bob", "Charlie") // mutableListOf는 변경 가능한 리스트

    names.add("Daisy")

    for (name in names) {
        println(name)
    }
}