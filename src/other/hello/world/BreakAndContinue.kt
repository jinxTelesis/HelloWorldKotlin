package other.hello.world

fun main(){

    for (number in 1..10){
        println(number)
    }

    for(number in 1..10){

        if(number==5){
            continue
        }
        println(number)
    }

    for(number in 1..10){
        if(number==6){
            break
        }
        println(number)
    }

    println("End App")


    loop@for(number in 1..10){

        println("number: $number")
        for(inner in 1..3){
            if(inner==6){
                break@loop
            }
        }
    }


}