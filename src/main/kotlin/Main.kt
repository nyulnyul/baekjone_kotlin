import java.time.LocalDateTime
import java.time.LocalTime
import java.util.ArrayList
import java.util.Scanner
import kotlin.math.max

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val c = nextInt()

    val list : ArrayList<Int> = arrayListOf(a,b,c)
    list.sort()
    print(list[1])

    }







