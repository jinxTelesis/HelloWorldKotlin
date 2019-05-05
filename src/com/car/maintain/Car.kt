package com.car.maintain

import java.security.acl.Owner

class Car(val type:String, val Model:Int, val price:Double, val milesDrive:Int, val owner:String){

    init{
        println("Object class is created")
    }

    fun getCarPrice():Double{
        return this.price-(this.milesDrive.toDouble()*10)
    }


}

fun main(){
    val car = Car("BMW",2015,10000.0,105,"Hussein Alrubyaye") // this is instance of the class
    val car2 = Car("Toyota",2019,39000.0,10,"Jena Alrubyaye")
}