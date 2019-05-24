package other.hello.world.car

data class Person(val name:String, val age:Int, val gender:String)


fun main(){

    val person = Person("dre",30,"male")
    println("person.name: ${person.name}")
    println("person.name: ${person.age}")
    println("person.name: ${person.gender}")


}