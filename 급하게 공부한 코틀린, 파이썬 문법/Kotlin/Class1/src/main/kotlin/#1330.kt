import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()

    if(a > b){
        println(">")
    } else if(a == b){
        println("==")
    } else {
        println("<")
    }
}