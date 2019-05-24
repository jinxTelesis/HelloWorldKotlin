package other.hello.world.car

enum class Direction{
    NORTH,SOUTH,EAST,WEST
}


fun main(){

    var userdirect=Direction.SOUTH

    if(userdirect==Direction.NORTH){
        println("he went to the north")
    } else
    {
        println("I don't know where he went")
    }

}