package exam01_09.exam5

class Person(
    var name: String = "",
    var age: Int = 0
) {

    fun greet() {
        println("Hello, my name is " + name)
        println("and my age is " + age)

        println("Hello, my name is $name")
        print("and my age is $age")
    }
}

fun main() {

    val person = Person("Alice", 20)

    person.greet()
}