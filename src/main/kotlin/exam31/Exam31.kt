package exam31

class Person(
    val name: String = ""
    // private val name: String = ""
) {
//    fun getName(): String {
//        return name
//    }
}

// kotlin에서는 따로 Getter, Setter를 만들지 않아도 된다.
fun main() {

    val p = Person("Alice")

    print(p.name)
//    println(p.getName())
}