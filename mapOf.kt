fun main() {
    val dayOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(dayOfTheWeek[2])

    for(key in dayOfTheWeek.keys){
        println("$key is to ${dayOfTheWeek[key]}")
    }

    var smartphonesMap = mapOf( "First" to Smartphone("Iphone 13 Pro Max", 150.99),
                                "Second" to Smartphone("Samsung Galaxy S21 ultra", 259.99),
                                "Third" to Smartphone("Google Pixel 6 Pro", 120.99))

    println(smartphonesMap)
    for (key in smartphonesMap.keys){
        println("$key ${smartphonesMap[key]?.name}")
    }

    var newDays = dayOfTheWeek.toMutableMap()
    newDays[3] = "Thursday"
    newDays[4] = "Friday"

    println(newDays.toSortedMap())
}


data class Smartphone(val name:String, val price:Double)