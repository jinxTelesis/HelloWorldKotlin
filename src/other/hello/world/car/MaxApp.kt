package other.hello.world.car

fun ArrayList<Int>.findMax():Int{
    var maxNumber = 0
    for(item in this){ // the this here is refering to ArrayList<Int> itself
        if(item > maxNumber){
            maxNumber = item
        }
    }

    return maxNumber
}

fun main(){

    val listOfElements = ArrayList<Int>()
    listOfElements.add(12)
    listOfElements.add(13)
    listOfElements.add(4)
    listOfElements.add(5)

    for(item in listOfElements){
        println(item)
    }

    println(listOfElements.findMax())



}