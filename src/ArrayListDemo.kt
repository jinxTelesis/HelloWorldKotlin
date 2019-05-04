fun main(){

    println("Pets App")
    print("Enter number of Pets: ")
    val maxSize = readLine()!!.toInt()

    var listOfPets = ArrayList<String>()

    for(i in 0 until maxSize){
        print("Enter Pet name $i")
        listOfPets.add(readLine()!!.toString())
    }

    do{
        print("Enter Pet name or exit to quit:")
        val petName = readLine()!!.toString()
        if(petName != "quit"){
            listOfPets.add(petName)
        }
    } while (petName!="quit")

    println("Your pets Are using Array")
    for(i in 0 until listOfPets.size){
        println("pet $i: ${listOfPets[i]}")
    }

    println("Your pets Are using Object")
    for(pet in listOfPets){
        println("Pet $: ${pet}")
    }

    if(listOfPets.contains("cat")){
        println("You cat qulified for special care")
    }

}