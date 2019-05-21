package other.hello.world

fun main(){

    print("Enter year of Brith: ")
    val yearOfBirth = readLine()!!.toInt()

    val age = 2019 - yearOfBirth

    print("You are $age years old")
}