package oo

//generates hashCode, equals toString, copy, destructuring operator
data class Address(val street: String, val number: Int, val postCode: Int, val city: String)

fun main(args: Array<String>) {
    val residence = Address("Main St", 42, 1234, "New York")
    val residence2 = Address("Main St", 42, 1234, "New York")

    println(residence)

    //Referencial equality
    println(residence === residence2)

    //Structural equality
    println(residence == residence2)

    //copy
    val neighbour = residence.copy(number = 43)
    println(neighbour)

    //Destructuring
    residence.component1()
    val (street, number, postCode, city) = residence
    println("$street $number $postCode $city")

}