package basics

fun main(args: Array<String>) {
    println("Enter your name")
    val name: String? = readLine()
    val myName = if (name.isNullOrEmpty()) "Orionisthenamelse" else name
    println("Name: $myName")
}