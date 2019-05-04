fun main(){

    var name:String = "Hussein" // var is not a val
    val age:Int = 30 //
    val GPA:Double = 3.8

    print("==User info ")
    println("Name: $name")
    println("Age:$age")
    println("GPA $GPA")

    var count = 1
    println("Count: $count")
    count = 10
    print("Count : $count")

    var department:String? // this might be null
    department = null
    department = "Software Engineering"
    print("Departnemt ${department!!}") // null safety
    print("Department ${department!!}")






}