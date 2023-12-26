import java.util.Scanner

fun main() =  with(Scanner(System.`in`)){
    val star = "*"
    val space = " "
    val n = nextInt()

    for(i in 1..n){
        print(space.repeat(n-i))
        println(star.repeat(i))
    }

}
