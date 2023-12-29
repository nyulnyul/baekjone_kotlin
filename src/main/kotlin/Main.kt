import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var cnt = 1
    while (true) {
        val a = readLine().toInt()
        if (a == 0) break

        print("$cnt. ")
        val b = 3 * a
        if (b % 2 == 0) {
            val e = (b / 2) * 3 / 9
            println("even $e")
        } else {
            val e = ((b + 1) / 2) * 3 / 9
            println("odd $e")
        }
        cnt++
    }
}
