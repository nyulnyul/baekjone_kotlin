import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine().toInt()
    var a = readLine().split(" ").filter { it.isNotEmpty() }.map { it.toInt() }.sorted()


        println(a[0] * a.last())

}
