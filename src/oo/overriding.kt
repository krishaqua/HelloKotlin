package oo

abstract class Vehicle(open val brand: String = "") {
    open fun drive() {
        println("Driving")
    }

    abstract fun honk()
}

class Sedan(override var brand: String = "SEDAN") : Vehicle(), Drivable {
    override fun honk() {
        println("hoonksedan")
    }

    override fun drive() {
        super<Drivable>.drive()
    }
}

fun main(args: Array<String>) {
    val sedan = Sedan()

    sedan.drive()
    sedan.honk()
}