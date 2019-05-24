package other.hello.world.car.files

import javax.xml.bind.DatatypeConverter.parseInt

fun main(){

    val x = 10

    when(x){
        1->print("x == 1")

        2->print("x == 2")

        else ->{
            print("x is netiehr 1 nor 2")
        }

    }

    when (x) {
        0,1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }

    val s = "10";

    when(x){
        parseInt(s) -> print("s encodes x")
        else -> print("s does not encode x")
    }


    when(x){
        in 1..10 -> print("x is in the range")
        !in 10..20 ->("x is outside the range")
        else -> print("none of the above")
    }

    for (i in 1..3){
        println(i)
    }

    for (i in 6 downTo  0 step 2){
        println(i)
    }


}

fun hasPrefix(x: Any) = when(x){
    is String -> x.startsWith("prefix") // that is really cool
    else ->false
}