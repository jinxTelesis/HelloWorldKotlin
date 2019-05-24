package other.hello.world.car

abstract class CreditCard2(){

    fun CreditID():String{
        return "21131221fdfs"
    }

    abstract fun newCredit()
}

class UserInfo():CreditCard2(){ // implements abstract class
    fun getInfo():String{
        return CreditID()
    }

    override fun newCredit() {
        println(" new cart created")
    }
}

fun main(args:ArrayList<String>){

    var user=UserInfo()
    println(user.getInfo())


}