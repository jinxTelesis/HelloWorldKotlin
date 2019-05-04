fun main(){

    val message="Welcome to new York?"
    val name = "Hussein"
    val allMessage = "$name,$message" // template version
    print(allMessage[1])
    print(allMessage.toLowerCase())
    print(allMessage.toUpperCase())
    print(message.trim())

    val tokens:List<String> = message.split(" ")
    for(token:String in tokens ){
        if(!token.contains("to") && !token.contains("is")){
            print("token: $token")
        }
        println("token: $token")
    }

}