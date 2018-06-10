package oo

//private visibility - same as Java
//protected - same as in Java
//internal - same inside the same module
//public - same as in Java (default without specifier in kotlin also public)

private val i = 42
fun a() = 17

class Car(val brand: String, private val model: String) {
    protected fun tellMeYourModel() = model
}

fun main(args: Array<String>) {
    val car = Car("BRAND", "MODEL")
    println(car.brand)
    println(i)
}