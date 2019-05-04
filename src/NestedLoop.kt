fun main(){

    for(number:Int in 1..10){
        if(number==5){
            continue
        }
        println(number)
    }

    println("Break Example")
    loop@ for(number:Int in 1..10){
        if(number ==6){
            break@loop
        }
        println(number)
    }






}