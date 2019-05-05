package com.car.maintain

class ClassConstructor{

    var type:String?=null
    var model:Int??=null
    var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null

    constructor(type:String,model:Int,price:Double,milesDrive:Int,owner:String)
    {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner=owner
    }


    // automatically makes setters and getters
    init{
        println("Object class is created")
    }

    fun getCarPrice():Double{
        return this.price!!-(this.milesDrive!!.toDouble()*10)
    }


}

fun main(){

}