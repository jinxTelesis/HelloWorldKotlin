package com.car.maintain

import com.car.maintain.com.example.cars.MyCar

public class CarWithCon(){
    var Owner:String?=null
    var Price:Double?=null
    var MilesDrive:Int?=null
    var Model:Int?=null
    var Type:String?=null
    constructor(Type:String,Model:Int,Price:Double,
                MilesDrive:Int,Owner:String):this(){
        println("Type:$Type")
        println("Model:$Model")
        println("Price:$Price")
        println("MilesDrive:$MilesDrive")
        println("Owner:$Owner")
        this.Owner=Owner
        this.Price=Price
        this.MilesDrive=MilesDrive
        this.Model=Model
        this.Type=Type
    }

    constructor(Name:String):this(){
        print("new class instance")
    }

    fun GetPrice():Double?{
        return this.Price!! -(this.MilesDrive!!.toDouble() * 10)
    }

    fun GetOwner():String?{
        return this.Owner;
    }

    fun main(args:Array<String>){
        var c=CarWithCon("Dre")
        var huCar = CarWithCon("BMW",2015,10000.0,105,"Hussein")

        println("Get Owner:" + huCar.GetOwner())
        println("Get price:" + huCar.GetPrice())

        var jeCar=CarWithCon("Ka",2017,20000.0,1,"Jena")
        println("Get Owner:"+jeCar.GetPrice())
        println("Get price:"+jeCar.GetPrice())

        var myclass= MyCar()
        myclass.toString()

    }


}