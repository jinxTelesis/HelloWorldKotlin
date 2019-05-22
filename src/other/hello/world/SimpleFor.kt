package other.hello.world

fun main(){

    println("Start App")

    for(i in 1..100 step 1){
        println("Number is $i")
    }

    println("End App")

    for(i in 100 downTo 0 step 2){ //reverse loop
        println("Number is $i")
    }

    for(i in 50 downTo 0 step 3){
        println("Number is $i")
    }

    for(i in 25 downTo 0){
        println("Number is $i")
    }

    for(i in 10 downTo 5){
        print("Number $i")
    }

    for(i in 5 downTo 0){

    }

    for(i in 99 downTo 5 step 2){
        println("Number is $i")
    }

    println("Decrement")
    for(i in 0..100 step 2){
        println("Number is $i")
    }

    println("++++++++++ decrement =========")
    for(i in 10 downTo 0 step 2){
        println("Number is $i")
    }






}