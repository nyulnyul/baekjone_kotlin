import java.util.Scanner
fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()

    for(i in n.downTo(1)){
        for(k in 0 until n-i){
            print(" ")
        }
        for(j in 0 until i){
            print("*")
        }
        println()
    }

}
