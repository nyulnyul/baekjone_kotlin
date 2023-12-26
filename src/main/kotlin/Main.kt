import java.util.Scanner
fun main() = with(Scanner(System.`in`)) {
    val n =nextInt()
    val nums = ArrayList<Int>()

    for(i in 1..n){
        nums.add(nextInt())
    }
    val v = nextInt()
    var count = 0
    for(i in nums){
        if(i == v){
            count++
        }
    }
    println(count)
}
