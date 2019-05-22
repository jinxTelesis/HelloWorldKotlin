package other.hello.world

import java.util.*

fun main(){

    print("Enter year of Brith: ")
    val yearOfBirth = readLine()!!.toInt()

    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR) // dynamic

    val age = 2019 - yearOfBirth

    print("You are $age years old")
}