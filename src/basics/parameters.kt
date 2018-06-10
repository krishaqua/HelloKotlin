package basics

fun main(args: Array<String>) {
    val together = concat(listOf("Kotlin", "Java", "Python"), separator = ":")
    println(together)
}

fun concat(texts: List<String>, separator: String = ", ") = texts.joinToString(separator)