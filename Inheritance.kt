// 1
// open class Base {
//     init {
//         println("In am in Base class") 
//     }
// }
// open class Child : Base() {
//     init {
//         println("I ama in Child Class")
//     }
// }
// class GrandChild : Child() {
//     init {
//         println("I am in Grand Child class")
//     }
// }
// fun main() {
//     GrandChild()
// }

// 2 
// open class Base() {
//     open val name: String
//     init {
//         name = "Base"
//     }
//     open fun displayName() {
//         println("I am in "+ this.name)
//     }
// }
// class Child() : Base() {
//     override fun displayName() {
//         super.displayName()
//         println("I am in "+ super.name)
//     }
// }
// fun main (args: Array<String>) {
//     var  a = Child()
//     a.displayName()
// }
    //  3
open class A() {
    private val i = 1

    fun doSomething() {
        println("Inside doSomething")
        println("Value of i is $i")
    }
}
class B: A() {
    fun printValue() {
        doSomething() 
        //  println("Value of i is $i")
    }
}
fun main() {
    A()
    val b = B()
    b.printValue()
}