//  Program to print the half pyramid using *.
fun main(args: Array<String>) {
    val a = args[0].toInt()
    for(i in 1..a)
    {
        for(j in 1..i) {
            print("* ")
        }
        println()
    }
}