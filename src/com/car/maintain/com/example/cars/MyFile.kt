package com.car.maintain.com.example.cars

import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args:Array<String>){

    WriteToFile("Dre")

}

fun WriteToFile(str:String){

    try {
        var fo = FileWriter("test.txt",true)
        fo.write(str+"\n")
    fo.close()}
    catch(ex:Exception){
        print(ex.message)
    }
}

fun ReadFromFile(){

    try{
        var fin=FileReader("")
        var c:Int?
        do {
            c=fin.read()
            print(c.toChar())
        } while()
    }catch (ex:Exception){


        print(ex.message)
    }
}