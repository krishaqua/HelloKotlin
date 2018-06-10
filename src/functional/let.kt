package functional

import java.io.File

fun main(args: Array<String>) {

    //scoping
    File("example.txt").bufferedReader().let {
        if (it.ready()) {
            println(it.readLine())
        }
    }
    //nullable
    val str: String? = "Kotlin for Android"
    str?.let {
        if (str.isNotEmpty()) {
            str.toLowerCase()
        }
    }
}