import java.util.*

fun main(){


    for(userId in 1..2){

        print("$userId- Enter your name: ")
        val name = readLine()!!.toString()
        print(" Where you live: ")
        val livePlace = readLine()!!.toString()
        var petName:String?=""
        print("Enter number of Pets: ")
        val petsCount = readLine()!!.toInt()
        var listOfUserPets = LinkedList<String>()

        for(petId in 1..petsCount){

            print("Enter Pet $petId")
            petName = petName + readLine()!!.toString() + ","
        }

        println("===== User info =======")
        println("name: $name")
        println("livePlace: $livePlace")
        println("petName: $petName")

        if(petName!!.contains("cat")){
            println("We have program for your cat")
        }

    }

}