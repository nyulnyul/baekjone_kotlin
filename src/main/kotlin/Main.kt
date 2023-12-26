import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var a =nextInt()
    var b = nextInt()
    val c = nextInt()

    if(a==b && b==c) {
        println(10000 + a * 1000)
    } else if(a==b || a==c) {
        println(1000 + a * 100)
    } else if(b==c) {
        println(1000 + b * 100)
    } else {
        println(Math.max(Math.max(a, b), c) * 100)
    }
}