// create a kotlin program : ----------------------------
// Priya goes to mall, and she purchased 6 products.
// -> 1 input should be at-least above 100
// -> and at-least 1 should be above 200;
// -> sort the product price in form of ascending order;
// -> If Priya purchase product above 100 then ₹10 discount;
// -> If Priya purchase product above 200 then ₹20 discount;
// -> If the total value goes above 500 then 20% discount;
// -> Find the total and the average
fun main(args: Array<String>) {
    var total:Int = 0
    var average:Int
    var flag1:Boolean = false
    var flag2:Boolean = false

    for(i in 0..5) {
        var value:Int = Integer.parseInt(args[i])
        if(value > 100 && value <= 200) {
            flag1 = true
        }
        else if(value > 200) {
            flag2 = true
        }
    }
    if(flag1 == true && flag2 == true) {
        print("Values entered are : ")
        for(i in 0..5) {
            var value: Int = Integer.parseInt(args[i])
            print(args[i] + " ")
            if(value > 100 && value <= 200) {
                total += value - 10
            }
            else if(value > 200 && value < 500) {
                total += value - 20
            }
            else {
                total += value
            }
            if(total >= 500)
            {
                total = (8 * total)/10
            }
        } 
        average = total / 6
        println("\nTotal Value is : $total")
        println("Average Value is : $average")
    }
    else {
        println("Wrong Input given At least one value should be greater than 100 and one greater than 200.\nPlease try again \n")
    }
}