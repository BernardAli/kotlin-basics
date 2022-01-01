fun main() {
    var x = 10

    while(x >= 0) {
        println(x)
        x--
    }
    println("while loop is done")

    var a = 0
    do {
        println(a)
        a++
    } while (a <= 10)

    var feltTemp = "cold"
    var roomTemp = 10

    while (feltTemp == "cold"){
        roomTemp++
        if ( roomTemp >= 20) {
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }

    for(num in 0 until 10 step 2){
        println(num)
        if(num == 6) {
            break
        }
    }

    for(i in 0 until 10){
        if(i/2 == 2) {
            continue
        }
        println(i)
    }
}