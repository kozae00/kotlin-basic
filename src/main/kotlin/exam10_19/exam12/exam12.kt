package exam10_19.exam12

class Greeting {
    fun sayHello() {
        println("Guest")
    }

    fun sayHello(name: String) {
        println(name)
    }
}

fun main() {
    val greeting: Greeting = Greeting()
    greeting.sayHello()
    greeting.sayHello("Alice")
}