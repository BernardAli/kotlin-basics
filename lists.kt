fun main() {
    val months = listOf("Jan", "Feb", "Mar")
    val anyTypes = listOf(1, 2, 3, true, "Love", "Muna")

    println(anyTypes.size)
    println(months[1])

    for (mon in months){
        println(mon)
    }

    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("Apr", "May", "Jun")

    additionalMonths.addAll(newMonths)
    additionalMonths.add("Jul")

    println(additionalMonths)

    val days = mutableListOf<String>("Sun", "Mon", "Tue", "Wed", "Thu")
    days.add("Fri")
    days[2] = "Sat"
    days.reverse()
    days.removeAt(2)

    val removeList = mutableListOf<String>("Wed", "Thu")
    days.removeAll(removeList)
    println(days)
}