package functional

fun modifyString(str: String, operation: (String) -> String): String {
    return operation(str)
}

fun main(args: Array<String>) {
    val modStr = modifyString("Kotlin is Amazing", { it.toUpperCase() })
    println(modStr)
}