package com.car.maintain

class UserAdmins<T>(credit:T){

    init{
        println(credit)
    }
}

fun <T> display(process:T){
    println(process)
}


fun main(args:Array<String>){
    var userAdmin=UserAdmins<String>("hussein")
    var userAdmin2=UserAdmins<Int>(12)
    var userAdmin3=UserAdmins<Double>(1234.1)

    display<Int>(22)
    display<String>("basic template")
}