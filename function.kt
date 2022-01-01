fun main() {
    myFunction()
    println(addUp(
        50,
        25,
    ))
    println(average(22.0, 7.0))
}

fun addUp(a:Int, b:Int):Int {
    return a + b
}

fun average(a:Double, b:Double):Double {
    return (a + b)/2
}

fun myFunction(){
    println("Called from my Function")
}