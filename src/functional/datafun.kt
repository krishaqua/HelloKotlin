package functional

fun main(args: Array<String>) {
    // Some faulty data with ages of our users
    val data = mapOf(
            "users1.csv" to listOf(32, 45, 17, -1, 34),
            "users2.csv" to listOf(19, -1, 67, 22),
            "users3.csv" to listOf(),
            "users4.csv" to listOf(56, 32, 18, 44)
    )

    val averageAge = data.values.flatMap({ it.filter { it > 0 } }).average()
    println("Average age: $averageAge")
    println("File names with wrong data")
    for (fName in data.keys) {
        if (data[fName]!!.any { it < 0 }) {
            println(fName)
        }
    }

    val flatMap = data.values.flatMap { it }
    val countWrong = flatMap.count { it < 0 }
    println("Total wrong: $countWrong")

    // Better code below
    val averageAge1 = data.flatMap { it.value }
            .filter { it >= 0 }
            .average()
    println("Average Age = $averageAge1")

    val faultyFile = data.filter { it.value.any { it < 0 } }
            .map { it.key }
    println("Faulty files: $faultyFile")

    val numFautyEntries = data.flatMap { it.value }
            .count { it < 0 }
    println("Num of faulty values = $numFautyEntries")
}