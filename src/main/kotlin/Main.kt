import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    while (true){
        var a = readLine()
        if(a == "0") break
        println(if (a == a.reversed()) "yes" else "no")
    }
}
