
var name:String?=null // this one is global

fun showUserInfo(name:String){ // warns you right away considers all the files under one class
    print("name:$name")
}

fun main(){
    var name = "Hussein"
    showUserInfo(name)

    for(i in 1..10){
        val age=22
    }
    //print(age) local obviously 

}
