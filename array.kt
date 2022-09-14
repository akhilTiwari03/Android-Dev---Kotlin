fun main() {
    val fruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange" , "Gauva", "Apple")
    println(fruits.get(0))
    println(fruits.get(2))

    
    println(fruits.get(3))
    println("Size of fruits array "+ fruits.size)
    
    println()
    // Loops
    for (item in fruits) {
        println(item)
    }

    var i: Int = 0;
    for(item in fruits)
    {
        println(item + " is present at index "+ i++);
    }
    // Conditionals
    println()
    if("Mango" in fruits) {
        println("Mango exists in fruits")
    }
    else {
        println("Mango is not there in fruits")
    }
    // finding the unique elements in array

    println()
    val distinct =fruits.distinct()
    for(item in distinct)
    {
        println(item)
    }

    // We can use drop() or dropLast() member functions to drop elemensts from the beginning or from the last respectively
    
    println()
    var result = fruits.drop(2)
    for (item in result) {
        println(item)
    }
    println()
    var res1 = fruits.dropLast(2)
    for(item in res1) {
        println(item)
    }
    
    //  to check wheather the array is empty or not
    println()
    if(fruits.isEmpty()) {
        println("Is Array Empty : Yes")
    }
    else {
        println("Is Array Empty : No")
    }

    //  To create  Kotlin range we call rangeTo() function on the range start value and provide the end values as an argument
    println()
    for(num in 1.rangeTo(4)) {
        println(num)
    }
    println()
    for(num in 1..(6)) {  // 2nd way
        println(num)
    }
}