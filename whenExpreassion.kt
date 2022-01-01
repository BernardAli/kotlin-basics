fun main() {
    var season = 10

    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Spring")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Fall")
    }

    var myAge = 29
    when (myAge) {
        in 21 .. 150 -> println("now you may drink in the US")
        in 18 .. 20 -> println("you may vote and drive")
        in 16 .. 17 -> println("you may drive only")
        else -> "You are too young"
    }

    var x:Any = 13.37.toFloat()
    when (x) {
        is Int -> println("$x is an Int")
        is Float -> println("$x is a Float")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is a Boolean")
    }
}