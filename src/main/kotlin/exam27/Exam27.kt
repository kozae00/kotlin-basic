package exam27

val lazyValue: String by lazy {
    println("initialized!")
    "Hello"
}

fun main() {
    println(lazyValue) // 최초로 한번 호출될 때 사용.
    println(lazyValue)
}