// A inline function is declared with inline keyword. The use of line function enhances the performance of higher order function. The function tells the compiler to copy parameters and functions to the call site.
// fun main() {
//     myFunction({println("Inline function parameter")})

// }
// inline fun myFunction(function:()-> Unit) { // Unit is void 
//     println("I am inline function - A")
//     function()
//     println("I am inline function - B")
// }

// sqrt function
fun main() {
    val a: Double = 16.0
    myFunction({println(Math.sqrt(a))})
}
inline fun myFunction(function:()->Unit){ // inline doesn't allow to return the value
    function()
}


