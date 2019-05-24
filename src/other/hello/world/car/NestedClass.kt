package other.hello.world.car

class Outer{

    private val name:String?="Dre"

    inner class Nested{

        fun Show(){
            println(name)
        }
    }


}

fun main(){

    var outer=Outer()
//    var nested=Outer.Nested()
//    nested.Show()

}