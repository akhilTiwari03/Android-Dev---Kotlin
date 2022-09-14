fun main(args:  Array<String> ) {
    val a = args[0].toInt()
    val b = args[1].toInt()
    printhello(a, b)    
}
fun printhello(a:Int , b:Int) { //  way of declaring arguments
    val c = a+b
    println("Hello World " + c)
}
