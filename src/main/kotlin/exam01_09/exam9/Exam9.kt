package exam01_09.exam9

fun main() {
    val names = listOf("Alice", "Bob", "Jack")

    names.forEach{name -> println(name)}
    names.forEach{println(it)} // it은 람다식의 인자가 하나일 때 사용 가능
}