package other.hello.world.car

import java.util.*
import kotlin.collections.ArrayList

class Person2(var name:String, var age:Int):Comparable<Person2>{


    override fun compareTo(other: Person2): Int {
        return this.age - other.age
    }


}

fun main(){

    var listOfNames= ArrayList<Person2>()
    listOfNames.add(Person2("Dre",1))
    listOfNames.add(Person2("Fred",2))
    listOfNames.add(Person2("Irene",3))
    for(person in listOfNames){
        println("Name:" +person.name)
        println("Age;" + person.age)
    }

    println("after sort")
    Collections.sort(listOfNames)
    for(person in listOfNames){
        println("Name:" +person.name)
        println("Age;" + person.age)
    }




}