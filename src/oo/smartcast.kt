package oo


fun BiCycle.replaceWheel() {
    println("Reclacing wheel....")
}

fun Boat.startEngine(): Boolean {
    println("Starting Engine")
    return true
}

fun main(args: Array<String>) {

    val vehicle: Drivable = Boat()

    //instanceof <-> is

    if (vehicle is BiCycle) {
        vehicle.replaceWheel()
    } else if (vehicle is Boat) {
        vehicle.startEngine()
    }

    if (vehicle is Boat && vehicle.startEngine()) {
        println("Boat started")
    }

    if (vehicle !is Boat || vehicle.startEngine()) {

    }

    if (vehicle !is BiCycle) {
        return
    }

    vehicle.replaceWheel() //It can only be BiCycle
}