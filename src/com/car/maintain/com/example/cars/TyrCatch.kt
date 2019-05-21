package com.car.maintain.com.example.cars

fun main(args:Array<String>){

    try{
        var n2:Int= readLine()!!.toInt()
        var Div=100/n2 // this will throw exception

        print("DIV:$Div")
    } catch (ex:Exception){
        println(ex.message)
    }

    print("app is done")
}