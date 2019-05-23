package other.hello.world

fun main(){

    println("Pets app")
    print("Enter number of Pets: ")
    val maxSize = readLine()!!.toInt()

    var listOfPets= ArrayList<String>()

    do{

        val petName = readLine()!!.toString()
        listOfPets.add(petName)
        if(petName != "quit"){
            listOfPets.add(petName)
        }

    } while(petName!="quit")

    for(i in 0 until maxSize){
        print("Enter Pet name $i")
        listOfPets.add(readLine()!!.toString())
    }

    println("Your pets Are using array")
    for(i in 0 until listOfPets.size){
        println("Pet $i ${listOfPets[i]}")
    }

    if(listOfPets.contains("cat")){
        println("You cat qualified for special care")
    }






}