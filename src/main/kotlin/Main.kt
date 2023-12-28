

import java.util.Scanner
fun main() = with(Scanner(System.`in`)) {

    var a = nextInt()
    var b = nextInt()

    val gcd = GCD(a, b)
    val lcm = LCM(a, b, gcd)

    print("$gcd\n$lcm")




}

fun GCD(a: Int, b: Int): Int {
    if (a% b == 0) return b
    return GCD(b, a % b)
}
fun LCM(a: Int, b: Int, gcd:Int): Int {
    return (a * b) / gcd
}







