package com.car.maintain


fun ArrayList<Int>.findMax():Int{
    var maxNumber = 0
    for(item in this){
        if(item > maxNumber){
            maxNumber = item
        }
    }
    return maxNumber
}

fun main(){


    val listOfElements = ArrayList<Int>()
    listOfElements.add(12)
    listOfElements.add(14)
    listOfElements.add(15)
    listOfElements.add(19)

    for(item in listOfElements){
        println(item)
    }

    println("Max: ${listOfElements.findMax()}")
}