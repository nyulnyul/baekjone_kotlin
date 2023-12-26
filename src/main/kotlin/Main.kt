import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    var a = 0
    for (i in 1..n) {
       a+=i


    }
    println(a)
}