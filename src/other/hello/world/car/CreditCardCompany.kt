package other.hello.world.car

interface CreditCard{

    val cardNumber:String
    fun score(age:Int)

}

class MasterCard(override val cardNumber: String) :CreditCard{


    override fun score(age: Int) {

        if(age > 50){
            println("Negative")
        } else{
            println("Postiave")
        }
    }
}

class Visa(override val cardNumber: String) :CreditCard{


    override fun score(age: Int) {

        if(age > 60){
            println("Negative")
        } else{
            println("Postiave")
        }
    }
}

class PayPal(client:CreditCard):CreditCard by client{

    fun print(){
        println(this.cardNumber)
    }

}

fun main(){

    val visa = Visa("7121731712")
    println("Score:${visa.score(60)}")

    val masterCard = MasterCard("1213121")
    println("Score:${masterCard.score(50)}")

    val payPal = PayPal(masterCard)
    println("cardNumber Paypal: ${payPal.cardNumber}")
    payPal.print()

}