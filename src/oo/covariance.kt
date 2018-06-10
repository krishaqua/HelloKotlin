package oo

open class Being
open class Person : Being()
class Student : Person()

fun main(args: Array<String>) {
    val people: MutableList<Person> = mutableListOf(Person(), Person())
    people.add(Student()) //covariance

    val p = Student() //covariance

    val students: List<Person> = listOf<Student>() //covariance
    //val students2: MutableList<Person> = mutableListOf<Student>() //This not allowed !!!


}