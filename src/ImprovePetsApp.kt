import java.util.*
import kotlin.collections.HashMap

fun main(){


    var listOfUsers = HashMap<String,LinkedList<String>>() // change cart info to this to save? MAKE A CONVERTER FIRST IS
    for(userId in 1..2){

        print("$userId- Enter your name: ")
        val name = readLine()!!.toString()
        print(" Where you live: ")
        val livePlace = readLine()!!.toString()

        var listOfUserPets = LinkedList<String>()

        do{
            print("Enter Pet name or quit to go next: ")
            val petName:String = readLine()!!.toString()
            if(petName!="next"){
                listOfUserPets.add(petName)
            }
        } while(petName!="next")

        listOfUsers["$name:$livePlace"]=listOfUserPets


        println("===== User info =======")
        println("name: $name")
        println("livePlace: $livePlace")

        for(petName:String  in listOfUserPets){
            println("petName: $petName")
        }

        if(listOfUserPets.contains("cat")){
            println("We have program for your cat")
        }

        for(key in listOfUsers.keys){

            println("==== User info =====")
            println("name and play live: $key")

            val listofPet : LinkedList<String> = listOfUsers[key]!! // not needed but can store each value

            for(petName in listOfUsers[key]!!) {
                println("petName: $petName")
            }

        }

    }

}