interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

open class Cars(override  val maxSpeed:Double, val name:String, val brand:String): Drivable{
    open var range:Double = 0.0

    fun extendRange(amount: Double){
        if (amount > 0){
            range += amount
        }
    }

    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance:Double) {
        println("Drove for $distance km")
    }
}
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife:Double)
    : Cars(maxSpeed, name, brand) {
    var chargerType = "Type1"
    override var range = batteryLife * 5

    override fun drive(distance: Double) {
        println("drove $distance on electricity")
    }
    override fun drive():String {
        return "drove $range on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake the super car")
    }
}

fun main() {
    var landCruiser = Cars(200.0, "Land crusier", "Toyota")
    var teslaX = ElectricCar(250.0,"Model X", "Tesla", batteryLife = 85.0)
    teslaX.extendRange(200.0)
    landCruiser.drive(200.0)
    teslaX.drive(200.0)
    teslaX.drive()
    teslaX.chargerType = "Type2"
    teslaX.brake()
    landCruiser.brake()
}