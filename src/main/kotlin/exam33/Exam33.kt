package exam33

class Person(
    private var _name: String = ""
) {

    var name: String
        get() {
            if (_name.isEmpty()) {
                throw IllegalAccessException("이름이 설정되어있지 않습니다.")
            }
            return _name
        }
        set(value) {
            if (value.isEmpty()) {
                throw IllegalArgumentException("이름은 빈 값이 될 수 없습니다.")
            }
            _name = value
        }
}

fun main() {
    val person = Person()

    try {
        // 이름이 설정되지 않은 상태에서 접근 시 예외 발생
        println(person.name)
    } catch (e: Exception) {
        println(e.message)
    }

    // 이름을 설정합니다.
    person.name = "John Doe"
    println("이름: ${person.name}")
}
