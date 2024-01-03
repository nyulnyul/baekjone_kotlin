import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var n = readLine() ?: return
    var smileCnt =0
    var sadCnt =0
    for(i in 0..n.length-3){

       when{
           n.startsWith(":-)",i) -> smileCnt++
              n.startsWith(":-(",i) -> sadCnt++

       }

    }
   when{
       smileCnt == 0 && sadCnt == 0 -> println("none")
       smileCnt == sadCnt -> println("unsure")
       smileCnt > sadCnt -> println("happy")
       smileCnt < sadCnt -> println("sad")
   }


}
