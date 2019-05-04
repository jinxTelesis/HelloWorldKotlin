
fun main(){

    println("Pets App")
    val pet1:String = readLine()!!.toString()
    val pet2:String = readLine()!!.toString()
    val pet3:String = readLine()!!.toString()

    println("Your pets Are")
    println("pet1: $pet1")
    println("pet2: $pet2")
    println("pet3: $pet3")

    // Write App in Array
    var listOfPets:Array<String> = Array(3){""}
    for(i in 0..2){
        listOfPets[i] = readLine()!!.toString()
    }

    for(i in 0..2){
        print("Pet $i: ${listOfPets[i]}")
    }
}