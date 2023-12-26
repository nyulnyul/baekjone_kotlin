import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val x = nextInt()

    var n = nextInt()
    var ab =0

    for(i in 1..n){
        var a = nextInt()
        var b = nextInt()
        ab += a*b
    }

    if(x == ab) println("Yes")
    else println("No")


}


