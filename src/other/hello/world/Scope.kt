package other.hello.world

var name:String?=null

fun showUserInfo(name:String){
    name="welcome $name"
    print("name: $name")
}

fun main(){

    name = "dre"


    showUserInfo(name)

}