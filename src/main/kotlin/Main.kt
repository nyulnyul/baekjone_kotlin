import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine().toInt()
    var a = Array(n){""}
    for(i in 0 until n) {
        a[i] = readLine()

    }
    var res = readLine().toInt()
    when(res){
        1 ->{
            for(i in a){
                println(i)
            }
        }
        2 ->{
            for(i in a){
                println(i.reversed())
            }
        }
        3->{
            for(i in n -1 downTo 0){
                println(a[i])
            }
        }
    }




}
