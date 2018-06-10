package oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import oo.House.Companion.getNormalHouse as createHouse //package import

object CountryFactory {
    val a = 4
    fun createCountry(): Country = Country("Australia")
}

object DefaultClickListener : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        println("Mouse was clicked")
        super.mouseClicked(e)
    }
}

fun main(args: Array<String>) {
    CountryFactory.a
    val country = CountryFactory.createCountry()
    println(country)
    createHouse() //using the package import
}