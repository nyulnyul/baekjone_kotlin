import java.time.LocalDateTime
import java.time.LocalTime
import java.util.Scanner
fun main() = with(Scanner(System.`in`)) {
   val x = nextInt()
    val y = nextInt()
    val time = LocalDateTime.of(2007,x, y,0,0)

    val day = time.dayOfWeek.toString()
    println(day.substring(0,3))

}
