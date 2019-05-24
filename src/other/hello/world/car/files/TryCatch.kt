package other.hello.world.car.files

import java.lang.Exception

fun main(){

    try{

        print("enter N2:")
        var n2:Int= readLine()!!.toInt()
        var Div=100/n2
        println("Div:$Div")
        println("app is done")
    } catch(ex:Exception)
    {
        println(ex.message)
    }

}