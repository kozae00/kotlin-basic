package exam10_19.exam10.kt

data class Person(
    val name: String,
    val age: Int
) {

}

fun main() {
    val p1 = Person("Alice", 20)
    val p2 = Person("Alice", 20)
    println(p1)
    println(p1 == p2)
}