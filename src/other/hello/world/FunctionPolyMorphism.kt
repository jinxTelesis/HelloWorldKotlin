package other.hello.world

fun showInfo(cardID:Int){
    print("CardID: $cardID")
}

fun showInfo(name:String){
    print("Name: $name")
}

fun main(){

    showInfo("Dre")
    showInfo(1)

}