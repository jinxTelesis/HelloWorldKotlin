package other.hello.world

fun main(){

    val message=" Welcome to new York?"
    val name="Huessein"
    val allMessage = "$name,$message"
    print(allMessage[0])
    print(allMessage.toLowerCase())
    print(allMessage.toUpperCase())
    print(message.trim())
    print(message)

    val tokens = message.split("")
    for(token in tokens){
        if(token.contains("to") || !token.contains("is"))
        println("token: $token")
    }










}