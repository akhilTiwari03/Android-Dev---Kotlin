class myClass {
    // data member
    private var name:String = "Lovely Professional University" 
    // Member Function
    fun printMe() {
        print("The best Learning in - "+ name)
    }
}
fun main(args: Array<String>)
{
    val obj = myClass() // Create object of myClass class
    obj.printMe() //call a member function using object
}