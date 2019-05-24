package other.hello.world.car

class Car(val type:String,val model:Int,val price:Double
        ,val milesDriven:Int,val owner:String){
    init{
        println("Object class is created")
    }

    fun getCarPrice():Double{
        val priceTotal = price - (milesDriven.toDouble()*10)
        return price
    }
}

fun main(){

    val car = Car("CHEVY",2015,1000.0,105,"Dre")
    val car2 = Car("Toyota",2019,39000.0,10,"Franko")

    val listOfCars = arrayListOf<Car>()
    listOfCars.add(car)
    listOfCars.add(car2)

    for(car in listOfCars){
        println()
        println(car.owner)
        println(car.getCarPrice())
    }
}