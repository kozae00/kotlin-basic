package exam19

fun main() {

    val obj: Any = "Hello"

    if(obj is String) {
        println(obj.length)
    }
}