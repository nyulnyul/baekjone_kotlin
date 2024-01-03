import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine().toInt() ?: return
    var sum = 1
    for(i in 1..n) {
        sum *= i
    }
    println(sum)
}
