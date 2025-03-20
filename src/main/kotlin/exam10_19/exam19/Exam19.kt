package exam10_19.exam19

fun main() {

    val obj: Any = "Hello"

    if(obj is String) {
        println(obj.length)
    }
}