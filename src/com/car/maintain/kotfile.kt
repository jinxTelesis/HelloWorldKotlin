package com.car.maintain

fun main(args:Array<String>){
    var c=CarWithCon("Dre")
    var huCar = CarWithCon("BMW",2015,10000.0,105,"Hussein")

    println("Get Owner:" + huCar.GetOwner())
    println("Get price:" + huCar.GetPrice())

    var jeCar=CarWithCon("Ka",2017,20000.0,1,"Jena")
    println("Get Owner:"+jeCar.GetPrice())
    println("Get price:"+jeCar.GetPrice())
}