package other.hello.world.car

class Truck:CarOptions{


    var subType:String?=null

    constructor( type:String,model:Int,price:Double,milesDriven:Int,owner:String,subType:String):super(type,model,price,milesDriven, owner) {

        this.subType
    }

    constructor( type:String,model:Int,price:Double,milesDriven:Int,subType:String):super(type,model,price,milesDriven) {

        this.subType
    }

    override fun getCarPrice():Double{
        return this.price!!-(this.milesDriven!!.toDouble()*20)
    }
}

fun Truck.getCarPriceWrapper():Double{
    return this.getCarPrice()
}

fun main(){

    val car1 = CarOptions("BMW",2015,10000.0,105,"Dre")
    car1.type="KIA"
    println(car1.type)
    println(car1.owner)


    val truck1 = Truck("Mozda",2015,10000.0,105,"Dre")


}