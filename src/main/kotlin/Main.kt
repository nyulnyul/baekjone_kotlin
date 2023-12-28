import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

   while(true){
       val n = readLine() ?: break
   }

}

fun getOne(n: Int): Int {
    var result = 0
    for (i in 1..n) {
        if (i % 10 == 1) {
            result++
        }
    }
    return result
}