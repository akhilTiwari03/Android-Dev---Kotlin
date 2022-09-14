//      1
// fun main(args: Array<String>) {
//     try {
//     val data = 20 / 0  // may throw an exception
//     }
//     catch(e:ArithmeticException) {
//         println(e)
//     } 
//     println("Code below exception...")
// }

//      2
// fun main() {
//     var str:Int = getNumber("10.5")
//     println(str)
// }
// fun getNumber(str: String):Int {
//     return try {
//         Integer.parseInt(str)
//     }
//     catch(e: NumberFormatException) {
//        //println(e)
//        100
//     }
//     finally {
//         println("0")
//     }
// }

//      3 Multiple catch
// fun main() {
//     try {
//         val a = IntArray(5)
//         a[5] = 10/0
//     }
//     catch(e: ArithmeticException) {
//         println("arithmetic exception catch") 
//     }
//     catch(e: ArrayIndexOutOfBoundsException) {
//         println("array Index outofbounds exception")
//     }
//     catch(e:Exception) {
//         println("parent exception class")
//     }
//     println("code after try catch...")
// }

//  4 Nested Try Catch Block
fun main() {
    val num = intArrayOf(4,8,16,32, 128, 256, 512)
    val deno = intArrayOf(2,0,4,4,0,8)
    try {
        for(i in num.indices) {
            try {
                println(num[i].toString() +" / " + deno[i] + "is  " + num[i]/deno[i])
            }
            catch(exc: ArithmeticException){
                println("Can't divided by Zero")
            }
        }
    } catch(exc: ArrayIndexOutOfBoundsException) {
        println("Element not found")
    }
}
