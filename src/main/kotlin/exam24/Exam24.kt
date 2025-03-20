package exam24

class Person(
    var name: String,
    var age: Int,
    var weight: Double,
    var salary: Double
) {
    fun increaseAge(years: Int) {
        age += years
    }


    fun increaseWeight(kg: Double) {
        weight += kg
    }

    fun increaseSalary(amount: Double) {
        salary += amount
    }

    fun getInfo() {
        println("이름 : $name, 나이 : $age, 몸무게 : $weight, 연봉 : $salary")
    }
}


fun main() {
    val p1 = Person("Alice", 20, 50.0, 3000.0)

    with(p1) {
        increaseAge(1)
        increaseWeight(1.0)
        increaseSalary(100.0)
        getInfo()
    }

}