import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val x = nextInt()
    val longcnt = x/4
    for(i in 1..longcnt){
        print("long ")
    }
    print("int")


}


