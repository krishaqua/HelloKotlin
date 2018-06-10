package oo

fun Int.isEven(): Boolean = (this % 2 == 0) //Return type not needed

fun City.isLarge() = population > 1_000_000

fun main(args: Array<String>) {
    println(5.isEven())

    val naturals = listOf(2, 3, 5, 11, 8, 2)
    println(naturals.filter { it.isEven() })

    val austin = City()
    austin.name = "Austin"
    austin.population = 950_000

    println(austin.isLarge())
}