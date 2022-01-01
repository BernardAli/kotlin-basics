fun main() {
//    var numbers:IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
//    var numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    var numbers = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var numbersD = arrayOf(1.5, 2.5, 3.5, 4.1, 5.2, 6.5, 7.9)
    println(numbers.contentToString())
    for (element in numbers){
        println("${element * 2}")
    }
    numbers[0] = numbers[0] + 10
    println(numbers[0])

    for (element in numbers){
        println("${element * 2}")
    }

    for (num in numbersD) {
        println(num)
    }

    val days = arrayOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")
    println(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 11.50),
                        Fruit("Banana", 18.99))
    println(fruits.contentToString())
    println(fruits[0].name)
    for (index in fruits.indices){
        println("${fruits[index].name} is in the index $index")
    }

    val mix = arrayOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", 1, 2, 3)
    println(mix.contentToString())
}


data class Fruit(val name:String, val price:Double)