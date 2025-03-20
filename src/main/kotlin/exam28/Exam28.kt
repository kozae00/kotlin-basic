package exam28

class MathUtil {

    // static의 역할을 하는 companion object
    companion object {

        val PI = 3.141592

        fun square(n: Int): Int {
            return n * n
        }
    }
}

fun main() {
    MathUtil.square(5).also {
        println(it)
    }

    MathUtil.PI.also {
        println(it)
    }
}