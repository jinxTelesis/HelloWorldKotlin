package other.hello.world

fun main(){




    for(i in 1..10){

        print("Enter your name: ")
        val name = readLine()!!.toString()

        print("Where you live: ")
        val livePlace = readLine()!!.toString()
        var petName:String? = null

        for(petId in 1..3){
            print("Enter Pet $petId")
            petName = readLine()!!.toString()
        }

        println("======= User info =====")
        println("name: $name")
        println("livePlace $livePlace")
        println("petName: $petName")

        if(petName!!.contains("cat")){
            println("We have cat in the values")
        }


    }
}