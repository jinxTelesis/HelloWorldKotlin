package other.hello.world.car

class Singleton{

    var name:String?=null

    private constructor(){
        println("instance is created")
    }

    companion object{
        val instance:Singleton by lazy{
            Singleton()
        }
    }
}

fun main(){
//    var s1 = Singleton()
//
//    s1.name="dre"

    var s1=Singleton.instance
    s1.name="dre"

    var s2=Singleton.instance
    println(s2.name)

}