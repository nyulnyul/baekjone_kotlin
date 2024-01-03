import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine() ?: return
    var regex = Regex("[a.e.i.o.u]")
    n.chunked(1).count() { it.matches(regex) }.let { println(it) }

}
