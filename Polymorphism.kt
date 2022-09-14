// 1
// fun main() {
//     val circle : Shape = Circle(4.0)
//     println(circle.area())
//    val square : Shape = Square(4.0)
//    println(square.area())


// }
// open class Shape {
//     open fun area() : Double {
//         return 0.0
//     }
// }
// class Circle(val radius:Double) : Shape() {
//     override fun area(): Double {
//         return Math.PI * radius * radius
//     }
// }
// class Square(val side:Double) : Shape() {
//     override fun area() : Double {
//         return side * side
//     }
// }

//  2
// fun main() {
//     var temp: String? = "This is nullable variable " // iff we want to include null + strings then we need to use ? otherwise not.
//     temp = null
//     println(temp)
// }

//  3
// fun main() {
//     //var temp: String? = "This is nullable variable " // iff we want to include null + strings then we need to use ? otherwise not.
//    var temp: String? = null
//     println(temp?.length) // prints null
//     temp = "abc"
//     println(temp?.length) // prints null
// }

