package other.hello.world

fun main(){

    var name = "Hussein"
    val age = 30
    val GPA = 3.8

    print("===== User info =======")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $GPA")

    name = "Hussein alrubaye"

    var count = 1
    println("Count: $count")
    count = 10
    println("Count: $count")

    var department:String?
    department = "Software Engineering"
    department = null
    print("Department ${department!!}")


}