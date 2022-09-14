//  Program to Sort the string words in Dictionary Order 
fun main(args: Array<String>) {
    var words = ArrayList<String>()
    words.addAll(args)
    var len: Int = words.size
    for(i in 0..len-2) {
        for(j in 1..len-1 ) {
            if(words[i].compareTo(words[j]) > 0) {
                val temp = words[i]
                words[i] = words[j]
                words[j] = temp
            }
        }
    }
    println("The String in Dictionary Order : ")
    for(i in 0..len-1) {
        println(words[i])
    }
}