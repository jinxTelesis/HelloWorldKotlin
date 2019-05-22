package other.hello.world

fun main(){

    print("Enter your grade: ")

    val grade = readLine()!!.toInt()

    if(grade>= 90){

        println("A")
    }

    if(grade in 80..89){
        println("B")
    }

    if(grade in 70..79){
        println("C")
    }


}