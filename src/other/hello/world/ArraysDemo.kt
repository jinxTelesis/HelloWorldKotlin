package other.hello.world

fun main(){

    println("Pets app")
    val pet1 = readLine()!!.toString()
    val pet2 = readLine()!!.toString()
    val pet3 = readLine()!!.toString()

    println("Your pets Are")
    println("pet1: $pet1")
    println("pet2: $pet2")
    println("pet3: $pet3")

    var listOfPets:Array<String> = Array(3){""}
//    listOfPets[0] = readLine()!!.toString()
//    listOfPets[1] = readLine()!!.toString()
//    listOfPets[2] = readLine()!!.toString()

    for(i in 0..2){
        listOfPets[i] = readLine()!!.toString()
    }

    val maxSize = readLine()!!.toInt()


    for(i in 0 until maxSize){
        listOfPets[i] = readLine()!!.toString()
    }

    for(i in 0 until  maxSize){
        println("Pet $i ${listOfPets}")
    }

    for(i in 0..2){
        print("Pet $i ${listOfPets[i]}")
    }


}