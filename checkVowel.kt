// check wheather an alphabet is vowel or consonant using if...else statement.
fun main(args: Array<String>) {
    val ch = args[0]
    if(ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u") {
        println("$ch is a Vowel")
    }
    else {
        println("$ch is a Consonant")
    }
}