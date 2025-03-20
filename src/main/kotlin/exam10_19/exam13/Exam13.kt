package exam10_19.exam13

class Test() {

}

object Singleton  {
    fun showMessage() {
        println("Hello World")
    }
}

fun main() {
    Singleton.showMessage()

    val a = Singleton
    val b = Singleton

    println(a == b)

    val t1 = Test()
    val t2 = Test()

    println(t1 == t2)
}