package other.hello.world


fun addNumber(x:Double,y:Double):Double{

    val temp = x+y
    println("Add= $temp")
    return temp
}

fun displayInfo(vararg names:String){
    for(name in names){
        println(name)
    }
}


fun main(){
    var returnSub = addNumber(3.0,4.0)


    displayInfo(names = *arrayOf("Dre","Stacy","Joann"))
}