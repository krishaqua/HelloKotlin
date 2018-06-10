package functional

fun main(args: Array<String>) {
    /*val list =(1..1000).toList()

    val first10 = list.take(10)
    val withoutFirst900 = list.drop(900)
    println(first10)
    println(withoutFirst900)*/

    val list = generateSequence(0) { it + 10 }

    val first10 = list.take(10).toList()
    println(first10)
}