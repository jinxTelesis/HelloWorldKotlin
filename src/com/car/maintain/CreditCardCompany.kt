package com.car.maintain

interface CreditCard{
    val cardNumber:String

    fun score(age:Int)
}

class MasterCard(override val cardNumber: String) :CreditCard{


    override fun score(age:Int){

        if(age>50){
            println("Negative")
        }else
        {
            println("Positive")
        }
    }


}
class VisaCard(override val cardNumber: String) :CreditCard{


    override fun score(age:Int){

        if(age>60){
            println("Negative")
        }else
        {
            println("Positive")
        }
    }


}

class PayPal(client:CreditCard):CreditCard by client{

    fun print(){
        println(this.cardNumber)
    }
}

fun main(){
    val visa= VisaCard("12121311212121")
    println("Score: ${visa.score(50)}")

    val masterCard = MasterCard("2121212121312121")
    println("Score: ${masterCard.score(50)}")

    val payPal = PayPal(masterCard)
    println("cardNumber PayPal: ${payPal.cardNumber}")

}