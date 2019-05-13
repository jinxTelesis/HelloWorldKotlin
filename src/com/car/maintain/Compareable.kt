package com.car.maintain

import java.util.*
import kotlin.collections.ArrayList


class Person2(var name:String, var age:Int) :Comparable<Person2>{

    override fun compareTo(other: Person2): Int {
        return this.age - other.age // asec
        // desc returh other.age - this.age 
    }
}

fun main(args:Array<String>){


    var listOfNames2 = ArrayList<Person2>()

    listOfNames2.add(Person2("jena3",3))
    listOfNames2.add(Person2("Lava",1))
    listOfNames2.add(Person2("dre",33))

    for(person in listOfNames2){
        println("Name:"+person.name)
        println("age:"+person.age)

    }

    Collections.sort(listOfNames2)



    var listOfNames = ArrayList<String>()

    listOfNames.add("Jena")
    listOfNames.add("Laya")
    listOfNames.add("Hussein")

    println("before sort")

    for(name in listOfNames){
        print(name)
    }

    println("ater sort")

    Collections.sort(listOfNames)
    for(name in listOfNames){
        print(name)
    }


}