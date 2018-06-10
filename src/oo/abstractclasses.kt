package oo

abstract class Shape(val name: String) {
    abstract fun area(): Double
}

class Circle(name: String, val radius: Double) : Shape(name) {

    override fun area(): Double = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {
    val shape = Circle("Large Circle", 19.0)
    println(shape.area())
}