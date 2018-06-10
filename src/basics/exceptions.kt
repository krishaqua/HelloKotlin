package basics

import java.io.IOException

fun main(args: Array<String>) {

    val input = try {
        getExtInput()
    } catch (e: IOException) {
        e.printStackTrace()
        ""
    } finally {
        println("Finished")
        "Finallyyyy"
    }
    println(input)
}

fun getExtInput(): String {
    throw IOException("Cant read input")
}