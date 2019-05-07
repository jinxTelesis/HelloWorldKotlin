package com.car.maintain

enum class Direction{
    NORTH,SOUTH,EAST,WEST
}

enum class Coords{
    UTM,NAD1927,NAD1883,HARN
}


fun main(args:Array<String>){

    var userdirect=Direction.SOUTH

    if(userdirect==Direction.NORTH){
        println("he went to north")
    }
    else{
        println("i don't know where he went")
    }
}