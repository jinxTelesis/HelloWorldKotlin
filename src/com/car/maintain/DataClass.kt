package com.car.maintain

data class Person(val name:String, val age:Int, val gender:String)


fun main(){
    val person = Person("Hussein",30,"Male")
    println("person.name:  ${person.name}")
    println("person.name:  ${person.age}")
    println("person.name:  ${person.gender}")
}