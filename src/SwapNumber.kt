import java.util.*

fun main(){

    print("Enter DOB: ")
    val yearOfBirth:Int = readLine()!!.toInt()
    var yearInDevice = Calendar.getInstance().get(Calendar.YEAR);
    val age:Int = yearInDevice - yearOfBirth

    print("You are $age year old")
}