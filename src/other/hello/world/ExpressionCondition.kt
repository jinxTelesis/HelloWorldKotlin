package other.hello.world

fun main(){

    val isMarried = false
    val GPA = 3.8


//    val isQualifed = if(isMarried==true && GPA>=3.8){
//        isQualifed=1
//    } else{
//        0
//    }

    //print(isQualifed)

    val isGood = when(GPA){
        4.0 -> true
        else -> false
    }

    println(isGood)




}