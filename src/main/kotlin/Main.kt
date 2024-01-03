import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val regex = "[aeiouAEIOU]".toRegex()

    while (true) {
        val n = readLine() ?: break
        if (n == "#") break // '#' 입력 시 루프 종료

        val cnt = n.count { it.toString().matches(regex) } // 모음 개수 세기
        println(cnt)
    }
}
