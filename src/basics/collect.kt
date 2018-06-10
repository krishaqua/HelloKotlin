package basics

import java.util.*

fun main(args: Array<String>) {
    val mutableList = mutableListOf<Int>()
    val rand = Random()
    for (i in 1..100) {
        mutableList.add(rand.nextInt(100) + 1)
    }
    println(mutableList)
    val filtList = mutableList.filter { elem -> elem <= 10 }
    println(filtList)
}