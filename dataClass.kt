data class User(val id:Long, var name:String)

fun main() {
    val user1 = User(1, "Ben")
    val user2 = User(2, "Eddie")
    println(user1.id)
    user1.name = "Isaac"
    println(user1.name)
    println(user1 == user2)
    println(user1.equals(user2))

    println("User Details: $user1")

    val updateUser = user1.copy(name="Eddie")
    println(updateUser)
    println(user1)

    println(updateUser.component1())
    println(updateUser.component2())

    val (id, _) = updateUser
    println(id)
}