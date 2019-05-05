
val sum= {number1:Int,number2:Int -> // this is the correct lambda syntax
    number1 + number2
}

fun main(){
    val addNumbers:Int = sum(3,4)
    print("addNumbers: $addNumbers")

    val listOfNumber = listOf(10,15,22,34,80)

    for(number  in listOfNumber){
        println(number)
    }

    listOfNumber.forEach{number ->
        println(number)
    }
}