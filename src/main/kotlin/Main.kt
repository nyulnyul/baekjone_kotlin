import java.util.Scanner
fun main() = with(Scanner(System.`in`)) {

    var nums = ArrayList<Int>()

    for(i in 1..9){
        nums.add(nextInt())

    }
    println(nums.maxOrNull())
    print(nums.indexOf(nums.maxOrNull())+1)

}
