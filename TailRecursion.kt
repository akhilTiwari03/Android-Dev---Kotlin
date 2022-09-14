//  A tail recursion is the concept that is the alternative of the recursion and the curement of Stack Overflow and this can be implemented by passing an extra argument which is required to be calculated in the recusion call so that the n-1 operations doesn't wait to calculate its own answers.

//"A recursive function is eligible for the tail recursion iff the fucntion call to itself is the last operation it performs. It is useful while calculating factorial or some other processing on larfe numbers. So to avoid java.lang.StackOverflow error"

// fun main() {
//     val a = 4
//     val result = factorial(a)
//     println(result)
// }
// fun factorial(a:Int, accum:Int = 1):Int {
//     val result = a* accum
//     return if(a <= 1) result
//     else {
//         factorial(a-1 , result)

//     }
// }

// Higher Order Functions 


// fun main() {
//     val result = calculate(4, 5, ::sum)
//     println(result)
// }

// fun sum(a:Int, b:Int) = a + b

// fun calculate(a:Int , b:Int, operation:(Int,Int)->Int):Int {
//     return operation(a,b)
// }

// example 2 - Higher Order Functions

fun main() {
    val func = operation()
    println(func(4,3))
}
fun square(x:Int , y : Int)= x*y
fun operation():(Int,Int)->Int {
        return :: square
}