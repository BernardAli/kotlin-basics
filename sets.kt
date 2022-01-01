fun main() {
    val fruits = setOf("fruit", "apple", "grape", "apple", "mango")
    println(fruits.size)
    println(fruits)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")

    println(newFruits)
    println(newFruits.elementAt(2))
}