import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val w = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..readLine().toInt()) {
        val num = readLine().split(" ")
        w.write("Case #${i}: ${num[0].toInt() + num[1].toInt()}\n")
    }

    w.flush()
    w.close()
    close()
}
