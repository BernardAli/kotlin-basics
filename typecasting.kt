fun main() {
    val stringList: List<String> = listOf("Ben", "Ike", "Eddie", "Michael", "Muna")
    val mixedListType: List<Any> = listOf("Ben", 50.5, "Ike", "Eddie", 200, "Muna")

    println(stringList)
    println(mixedListType)

    for (value in mixedListType) {
        when (value) {
            is Int -> {
                println("Integer: '$value'")
            }
            is Double -> {
                println("Double: '$value'")
            }
            else -> {
                println("Boolean: '$value'")
            }
        }
    }

    // SMART CAST
    val obj1: Any = "I have a dream"

    if (obj1 !is String){
        println("Not a String")
    } else {
        println("Found a string of length ${obj1.length}")
    }

    // Explicit (unsafe) Casting using the "as" keyword - can go wrong
    var str1: String = obj1 as String
    println(str1.length)

    val obj2:Any = 1337
//    val str2:String = obj2 as String
//    println(str2.length)

    // Explicit (unsafe) Casting using the "as" keyword
    val obj3:Any = 1337
    val str3:String? = obj3 as? String
    println(str3)
}