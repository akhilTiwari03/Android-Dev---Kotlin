         //    Kotlin Collections

// Collections are a common concept for most programming language. A Collections usually constains a number of the objects of the same type and Objects  in  a Collection are called elements or items.

//  A Kotlin Standard Library provides a comprehensive set of tools for managing collections. The following collection types are relevant for Kotlin:
        //  a: Kotlin List: List is an ordered collection with accesss to elements by indices. Elements can occur more than once in a list.
        //  b: Kotlin Set: Set is a collection of unique elements which means a group of objects without repeattions.
        //  c: Kotlin Map: Map(or dictionary) is a set of key-value pairs.

        //List:
                // fun main() {
                //         val numbers = listOf("One", "two", "three", "four")
                //         println(numbers)
                // }
        // Iterators 
                // fun main() {
                //         val theList = listOf("one", "two", "three", "four")
                //         val itr = theList.listIterator()
                //         while(itr.hasNext()) {
                //                 println(itr.next())
                //         }
                // }
        // 2nd way
                // fun main() {
                //         val theList = listOf("one", "two", "three", "four")
                //         for(i in theList.indices)
                //         {
                //                 println(theList[i])
                //         }
                // }

                        // fun main() {
                        //         val theList = listOf("one", "two", "three", "four")
                        //         theList.forEach{
                        //                 println(it)
                        //         }
                        //         println("Size of the list "+ theList.size)
                        // }

                // fun main() {
                //         val theList = listOf("one", "two", "three", "four")
                //         if("two" in theList) {
                //                 println(true)
                //         }
                //         else {
                //                 println(false)
                //         }

                //         if(theList.contains("two")) {
                //                 println(true)
                //         }
                //         else {
                //                 println(false)
                //         }

                //         //similarly .isEmpty(), .indexOf("Value") is used 
                // }

        // fun main() {
        //         val theList = listOf("one", "two", "three", "four")
                
        //         println("Elements  at 3rd  position "+ theList.get())
        // }

                // fun main() {
                //         val firstList = listOf("one", "two", "three")
                //         val secondList = listOf("Four" , "five", "six" , "seven")

                //         val resultList = firstList + secondList
                //         println(resultList)
                // }

                // Slicing a List : We can obtain a sublist from a given list using slice()method which use of range of the elements indices.
                // fun main() {
                //         val theList = listOf("one", "two", "three", "four")
                //         val resultList = theList.slice(2..3)
                //         println(resultList)
                // }
                        // Drop : used to drop first n elements from the list
                        // fun main() {
                        //         val theList = listOf("one", "two", "three", "four")
                        //         val resultList = theList.drop(3)
                        //         println(resultList)
                        // }

                // Group By: to group the elements matching with the given predicate.
                fun main() {
                        val theList = listOf(10,20,30.2,40,81,-3)
                        val resultList = theList.groupBy{it % 3}
                        println(resultList)
                }
        


