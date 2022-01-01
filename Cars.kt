import java.lang.IllegalArgumentException

fun main() {
    var myCar = Car()
    myCar.owner
    myCar.maxSpeed = 200
    println("My car is ${myCar.myBrand}")
    println("My car's max speed is ${myCar.maxSpeed}")
    println(myCar.myModel)
}

class Car {
    lateinit var owner: String

    val myBrand: String = "Toyota"
    get() {
        return field.toLowerCase()
    }
    var maxSpeed = 250
        get() = field
        set(value) {
             field = if(value > 0) value else throw IllegalArgumentException("Max speed can not be below 0")
        }
    var myModel: String = "Land Cruiser J300"
        private set

    init {
        this.owner = "Ben"
        this.myModel = "FJ Cruiser"
    }
}