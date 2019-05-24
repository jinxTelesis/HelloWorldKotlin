package other.hello.world

val sum = {number1:Int,number2:Int ->
    val temp= number1 + number2
}

fun main(){





    val addNumbers = sum(3,4)

    val listOfNumbers = listOf(10,15,22,34,80)


    for(number in listOfNumbers){
        println(number)
    }

    listOfNumbers.forEach{
        number -> println(number)
    }
}