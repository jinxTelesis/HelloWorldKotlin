package com.car.maintain

class Truck{
    var type:String?=null
    var model:Int??=null
    var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null
    var subType:String?=null

    constructor(type:String,model:Int,price:Double,milesDrive:Int,owner:String,subType:String)
    {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner=owner
        this.subType=subType
    }


    // automatically makes setters and getters
    init{
        println("Object class is created")
    }

    fun getCarPrice():Double{
        return this.price!!-(this.milesDrive!!.toDouble()*10)
    }


}