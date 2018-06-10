package oo

interface Drivable {
    fun drive() {
        println("Driving Interface")
    }
}

class BiCycle : Drivable {
    override fun drive() {
        println("Driving BiCycle")
    }
}

class Boat : Drivable {
    override fun drive() {
        println("Driving Boat")
    }
}

fun main(args: Array<String>) {
    val drivable: Drivable = BiCycle()
    drivable.drive()
}