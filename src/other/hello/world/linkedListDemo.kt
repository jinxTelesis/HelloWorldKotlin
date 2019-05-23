package other.hello.world

import java.util.*

fun main(){

    println("Pets App")

    var listOfPets = LinkedList<String>()

    do{
        print("Enter pet name or exit to quit:")
        val petName= readLine()!!.toString()
        if(petName !="quit") {
            listOfPets.add(petName)
        }

    }while(petName!="quit")

    println("Your pets are using index")
    for(i in 0 until listOfPets.size){
        println("Pet $i ${listOfPets[i]}")
    }

    println("Your pets are using Object")
    for(pet in listOfPets){
        println("Pet: $pet")
    }

    if(listOfPets.contains("cat")){
        
    }



}