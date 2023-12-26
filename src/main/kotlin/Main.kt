import java.util.Scanner
fun main() = with(Scanner(System.`in`)) {
    val n =nextInt()
    var nums = ArrayList<Int>()

    for(i in 1..n){
        nums.add(nextInt())
    }
    print("${nums.minOrNull()} ${nums.maxOrNull()}")




}
