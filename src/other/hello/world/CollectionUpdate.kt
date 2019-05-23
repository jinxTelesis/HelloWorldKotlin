package other.hello.world

fun main(){

    //1- list
    //im-mutable
    var list = listOf("jena","lava")

    for(name in list){
        print(name)
    }

    var listMutable = mutableListOf("jena","Lava")
    listMutable[0] = "Dre"

    for(name in list){
        println(name)
    }


    var mapOfUsers= mapOf(1 to "dre",2 to "George")

    var mapOfUsersMut = mutableMapOf(1 to "Dre",2 to "Timmy")


}