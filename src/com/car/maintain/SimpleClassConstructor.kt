package com.car.maintain

class CarWithCon(){
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


}