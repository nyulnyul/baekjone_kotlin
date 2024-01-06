import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine().toInt()
    var a = Array(n){""}
    for(i in 0 until n) {
        var s =readLine()

        a[i] = s.replaceFirstChar { it.toUpperCase() }

        println(a[i])
    }

}
