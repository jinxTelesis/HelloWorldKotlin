package other.hello.world.car

open class CarOptions(){

    var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesDriven:Int?=null
    var owner:String?=null

    constructor(type:String,model:Int,price:Double,milesDriven:Int, owner:String):this()
    {
        this.type = type
        this.model=model
        this.price=price
        this.milesDriven=milesDriven
        this.owner=owner
    }

    constructor(type:String,model:Int,price:Double,milesDriven:Int):this()
    {
        this.type = type
        this.model=model
        this.price=price
        this.milesDriven=milesDriven
    }

    open fun getCarPrice():Double{
        return this.price!!-(this.milesDriven!!.toDouble()*10)
    }


}

fun main(){

    val car = CarOptions("CHEVY",2015,1000.0,105,"Dre")
    val car2 = CarOptions("Toyota",2019,39000.0,10,"Franko")


}