package exam20_29.exam25

class Person {
    var name: String = ""
    var age: Int = 0
}

fun main() {

    val p1 = Person()

    p1.apply {
        name = "Alice"
        age = 25
    }.also {
        println("이름: ${it.name}, 나이: ${it.age}으로 생성됨")
    }.let {
        it.name.length
    }.run {
        this * 2
    }.also {
        println("이름 길이의 2배: $it")
    }

    val rst = with(p1) {
        "이름: $name, 나이: $age"
    }

}