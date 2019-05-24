package other.hello.world.car.files

import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(){

    println("1- read\n 2- write\n")
    val op = readLine()!!.toInt()

    when(op){
        1 -> ReadFromFile()

        2 -> {
            print("Write to file text:")
            var str:String= readLine().toString()
            WriteToFile(str)
        }
    }



}

fun WriteToFile(str:String){


    try {
        var fo = FileWriter("test.txt")
        fo.write(str)
        fo.close()
    } catch (ex:Exception){
        println(ex.message)
    }

}

fun ReadFromFile(){

    try{
        var fin=FileReader("test.txt")
        var c:Int?
        do{
            c=fin.read()
            print(c.toChar())
        }while(c!=-1)

    } catch(ex:Exception){
        println(ex.message)
    }

}