/*
mutable: you can update, add more
im-mutable : you cannot update, you cannot add more
 */

fun main(){

    // 1 - list
    // im-mutable
    var list = listOf<String>("Jena","lava")
    // list[0] = "Hussein" can't do that
    for(name in list){
        print(name)
    }

    var listMutable : MutableList<String> = mutableListOf("Jena", "lava")
    listMutable[0] = "Hussein"

    for(name:String in listMutable){
        println(name)
    }

    val listOfUserI = mapOf(1 to "hussein", 2 to "jena")
    var listOfUserSm :MutableMap<Int,String> = mutableMapOf(1 to "hussein", 2 to "jena")


}