package other.hello.world.car.files

fun main(){


    val array = arrayOf("a","b","c")
    for(i in array.indices){
        println(array[i])
    }

    for((index, value) in array.withIndex()){
        println("the element at $index is $value")
    }

    loop@ for (i in 1..100){
        for(j in 1..100){
            if(true)break@loop
        }
    }

}

fun foo(){

    listOf(1,2,3,4,5).forEach{
        if(it == 3)return // no local return to caller
        print(it)
    }

    println("cant get here")
}