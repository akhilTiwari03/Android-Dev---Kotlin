// // // kotlin when expression is similar to the sqitch statement in c, C++, Java.
fun main() {
    val day = 2
    val result = when(day) {
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else -> "Invalid Day."
    }
    println(result)
}

// // For loop , while and Do while loop, break statement, continue statement

fun main() {
    // for(i in 5 downTo 1 step 2) {
    //     println(i)
    // }

    // var i = 5
    // while(i > 0) {
    //     println(i--)-
    // }

    // var i = 5
    // do {
    //     println(i--)
    // }while(i > 0)

    // var i = 0
    // while(i++ < 100) {
    //     println(i)
    //     if(i == 3) {
    //         break;
    //     }
    // }
    // var i = 0
    // while(i++ < 6) {
    //     if(i == 3) {
    //         continue
    //     }
    //     println(i)
    // }

 }


 Labeled Break Statements

fun main(args: Array<String>) {
    outerLoop@ for(i in 1..5) {
        innerLoop@ for(j in 1..3) {
            println("i = $i and j = $j")
            if(i == 3) {
                break@outerLoop
            }
            if(i == 2 && j == 2)
            {
                break@innerLoop
            }
        }
    }
}

// Labeled Continue Statements

fun main() {
    outerLoop@ for(i in 1..3) {
        innerLoop@ for(j in 1..3) {
            if(i == 2) {
                continue@outerLoop
            }
            println("i = $i and j = $j")
        }
    }
}