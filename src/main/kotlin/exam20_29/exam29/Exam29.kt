package exam20_29.exam29


/**
 * kotlin에서 상속을 사용하려면 부모 클래스에 open 키워드를 붙여야 한다.
 * override 키워드를 사용하면 부모 클래스의 메소드를 자식 클래스에서 재정의할 수 있다.
 */

open class Animal {
    // 재정의 가능
    open fun makeSound() {
        println("Animal makes a sound")
    }

    // 재정의 불가
    fun move() {
        println("Animal moves")
    }
}

class Dog: Animal() {
    override fun makeSound() {
        println("Dog barks")
    }
}

fun main() {
    val myDog = Dog()
    myDog.makeSound()
}