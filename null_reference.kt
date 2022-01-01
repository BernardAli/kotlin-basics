fun main() {
    var name:String? = "Ben"
    name = null

    var nullableName :String? = "Bernard"
//    nullableName = null

    println(nullableName)
    if (name != null) {
        println(name.length)
    } else {
        null
    }

    var len = nullableName?.length


    //Safe calls
//    nullableName?.let { println(it.length) }

    var newName = name ?: "Guest"
    println(newName)

    println(nullableName !!.toLowerCase())
}