

//Kotlin
fun addNumbers(x:Double=0.0,y:Double=0.0):Double{
    val temp=x + y
    println("Add =$temp")
    return temp;
}

fun displayInfo(vararg  names:String){

    for(name in names){
        println(name)
    }

}

fun displayInfoA(names:String){
    for(name in names){
        println(name)
    }
}

fun main(){
    print("Main Fun")
    var returnSub:Double= addNumbers(x=3.0,y=4.0)
    println("returnSub: $returnSub")

    var returnAdd = addNumbers(5.0,12.0)
    println("returnAdd: $returnAdd")

    returnAdd = addNumbers(10.0,19.0)
    println("returnAdd: $returnAdd")

    returnAdd = addNumbers(10.0)
    println("returnAdd: $returnAdd")

    displayInfo(names = *arrayOf("Jena","Lava","Dora"))

}