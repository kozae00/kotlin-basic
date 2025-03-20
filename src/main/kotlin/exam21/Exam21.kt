package exam21

/**
 * let과 apply 함수
 * - let 함수는 람다식 내부에서 연산을 수행하고 결과를 반환
 * - apply 함수는 람다식 내부에서 연산을 수행하고 결과를 반환하지 않음
 */

fun main() {
    val name: String? = "hello"

    val len = name?.length ?: 0
    println(len)

    val rst = name?.let{
        println(it.length)
        10
    }

    println(rst)
}