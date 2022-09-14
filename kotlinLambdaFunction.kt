// Kotlin Lambda is a function which has no name and defined with a curly braces {} which takes zero or more parameters and body of function
fun main() {
    val uppercase = { str: String -> str.uppercase()}
    println(uppercase("hello, World!"))
}