fun main(){

    var listOfUsers = HashMap<Int,String>()
    listOfUsers[123] = "Hussein"
    listOfUsers[554] = "Jena"
    listOfUsers[12] = "Lava"

    listOfUsers[123] = "Rana" // overwrite

    println("print Id 123: ${listOfUsers[123]}")

    for(key in listOfUsers.keys){
        println("$key: ${listOfUsers[key]}")
    }



}