package jetbrains

/**
 * You have a natural number n. Generate a sequence of integers, described in the Collatz conjecture:
 * If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1.
 * Repeat this operation until you get 1 as a result.
 */

fun collatzConjecture(n: Int) : Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun collatzConjectureV1(n: Int) {
    var res = n
    while (true) {
        println(res)
        if (res == 1) break
        if (res % 2 == 0) res /= 2
        else res = 3 * res + 1
    }
}

fun collatzConjectureV2(n: Int) {
    println(n)
    when {
        (n == 1) -> return
        (n % 2 == 0) -> collatzConjectureV1(n/2)
        else -> collatzConjectureV1(3 * n + 1)
    }

}