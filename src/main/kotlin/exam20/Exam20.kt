package exam20

class Person{
    var name: String = ""
    var age: Int = 0

    fun printInfo() {
        println("이름 : $name, 나이 : $age")
    }
}

fun main() {

    val person1 = Person()
    person1.name = "Alice"
    person1.age = 25

    person1.printInfo()

    val person2 = Person().apply {
        name = "Alice"
        age = 20
    }

    person2.printInfo()
}