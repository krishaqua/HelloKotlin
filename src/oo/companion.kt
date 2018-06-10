package oo

interface HouseFactory {
    fun createHouse(): House
}

class House(val numberOfRooms: Int, val price: Double) {
    companion object : HouseFactory {
        val HOUSE_FOR_SALE = 10
        fun getNormalHouse() = House(6, 199_999.00)
        fun getLuxuryHouse() = House(40, 7_199_999.00)
        override fun createHouse(): House = getNormalHouse()
    }
}

fun main(args: Array<String>) {

    val normalHouse = House.getNormalHouse()
    println(normalHouse.price)
    println(House.HOUSE_FOR_SALE)
}