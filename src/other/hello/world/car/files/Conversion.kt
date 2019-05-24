package other.hello.world.car.files

fun main(){


    val a:Int = 10000
    println(a === a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // false


    val a2: Int = 10000
    println(a2 == a2)
    val boxedA2: Int? = a2
    val anotherBoxedA2: Int? =a2
    println(boxedA2 === anotherBoxedA2) // true
    // need an explict conversion for smaller types to bigger types

    val asc= Array(5) {i -> (i * i).toString()}
    asc.forEach { println(it) }

    // cant assign Array<String> to Array<Any>



}