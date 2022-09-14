// 1
fun main(args: Array<String>) {
    val arr = Array<Int>()
    arr.addAll(args)
    var max:Int = -1
    var min:Int = 9999999
    arr.forEach {
        if(it > max) max = it
        if(it < min) min = it
    }
    arr.forEach {
        if(it == max) it = min
    }
    arr.forEach {
        print(it.toString() + " ")
    }

}
// 2
fun main(args: Array<String>) {
    val arr = Array<Int>()
    arr.addAll(args) 
    var total : Double = 0.00
    arr.forEach {
        if(it > 100) {
            total += 0.8*it
        }
        else {
            total += it
        }
    }
    println(total)
}