package other.hello.world

fun main(){

    print("Enter number1:")

    val number1 = readLine()!!.toDouble()

    print("Enter number1: ")

    val number2 = readLine()!!.toDouble()

    val sum = number1 + number2
    println("Sum: $sum")

    val sub = number1 - number2
    println("sub: $sub")

    val mul = number1 * number2
    print("mul: $mul")

    val div = number1 / number2
    print("div: $div")


}