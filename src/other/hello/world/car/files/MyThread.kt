package other.hello.world.car.files

import java.lang.Exception

fun main(){

    var t1=thread("thread1")
    t1.run()
    println(" thread is run")

    var t2=thread("thread2")
    t2.start()
    println(" thread 2 is run")

    var t3=thread("Thread3")
    t3.start()
    println(" thread is run")
}

class thread:Thread{

    var ThreadName:String?=null

    constructor(ThreadName:String):super()



     override fun run(){
         //Write Thread
         var count =0
         while(count<10){
             println("Count:$count")
             count++
         }

         try{
             Thread.sleep(1000)
         } catch(ex:Exception){
             print(ex.message)
         }
     }
 }