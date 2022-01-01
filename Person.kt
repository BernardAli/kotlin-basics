fun main() {
    val ben = Person("Bernard", "Ali")
    val eddie = Person("Eddie", "Ali", 27)
    eddie.hobby = "Playing Football"
    eddie.stateHobby()
    ben.stateHobby()
    eddie.age = 20
    println("Eddie's age is ${eddie.age}")
}

class Person(firstName:String, lastName:String = "Ali"){
    // Member Variables - Properties
    var age:Int? = null
    var hobby:String = "watch netflix"
    var firstName:String? = null

    init {
        this.firstName = firstName
        println("Person Created for $firstName $lastName")
    }
    //Member Secondary Constructor
    constructor(firstName: String, lastName: String, age:Int)
                :this(firstName, lastName){
        this.age = age
        println("Person Created for $firstName $lastName with age $age")
                }


    //Member functions - Methods
    fun stateHobby() {
        println("$firstName's hobby is $hobby")
    }
}