package com.car.maintain

class Outer{

    private val name:String?=null

    class Nested{
        fun Show(){
            print("nested")
        }
    }


}

fun main(args:Array<String>){

    var outer=Outer()
    var nested=Outer.Nested() // gets the innner class
    nested.Show()


}