import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine().toInt() ?: return
    var list = mutableListOf<Int>()
    for(i in 0..n-1){
        list.add(readLine().toInt())


    }
    if(list[1]-list[0] == list[2]-list[1]){
        println(list.last() + list[1]-list[0])}
    else {
        println(list.last() * (list[1]/list[0]))
    }




}
