package other.hello.world.car

class UserAdmins<T>(credit:T){

    init{
        println(credit)
    }
}

fun main(){
    var userAdmins=UserAdmins<String>("Dre")
    var userAdmin2=UserAdmins<Int>(1234)

}