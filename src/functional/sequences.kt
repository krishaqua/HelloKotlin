package functional

import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    val veryLongList = (1..999999L).toList()
    var sum = 0L
    var lazySum = 0L
    val msNonLazy = measureTimeMillis {
        sum = veryLongList
                .filter { it > 50 }

                .map { it * 2 }
                .map { it / 3 }
                .map { it + 17 }
                .take(10000)
                .sum()
    }

    val msLazy = measureTimeMillis {
        lazySum = veryLongList
                .asSequence()
                .filter { it > 50 }

                .map { it * 2 }
                .map { it / 3 }
                .map { it + 17 }
                .take(10000)
                .sum()
    }
/*
    val seq = generateSequence(1,{it +1})
    println(sum)
*/

    println("Non-lazy: $msNonLazy ms, Result: $sum")
    println("Lazy: $msLazy ms, Result: $lazySum")

}