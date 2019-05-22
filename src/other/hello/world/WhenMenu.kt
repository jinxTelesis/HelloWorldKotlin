package other.hello.world

fun main(){

    print("Pick food menu: ")
    val foodID = readLine()!!.toInt()

    when(foodID){

        1 ->{
            print("You got Sandwitch")
            print("You got salat")
        }

        10 ->{
            println(" you got burger ")
        }

        else ->{
            println("You didnot order anythin")
        }


    }

    val grade = readLine()!!.toInt()

    when {

        grade>= 90-> println("A")
        grade in 80..89 -> println("B")
        grade in 70..79 -> println("C")

        else -> println("Fail")

    }
}