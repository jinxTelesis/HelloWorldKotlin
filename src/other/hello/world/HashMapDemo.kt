package other.hello.world

fun main(){

    var listOfUsers = HashMap<Int,String>()
    listOfUsers[123] = "Dre"
    listOfUsers[554] = "Jena"
    listOfUsers[12] = "Lava"

    println("Print ID 123: ${listOfUsers[123]}")


    for(key in listOfUsers.keys) {
        println("Print ID $key: ${listOfUsers[key]}")
    }


}