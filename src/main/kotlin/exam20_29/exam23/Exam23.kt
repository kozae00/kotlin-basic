package exam20_29.exam23

/**
 *  apply => this를 받고 객체를 반환
 *  let => it을 받고 람다의 결과값 반환
 *  also => it을 받고 객체를 반환
 *  run => this를 받고 람다 값을 반환
 */

fun main() {

    val num = 5

    val rst = num.run {
        this * 2 + 10
        // val x = 5
        // x * 2 + 10
    }

    println(rst)
}