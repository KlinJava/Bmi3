package com.hank.bmi3

class Hello {

}

fun main() {
//    dataType()
    val p = Person()
    p.hello()

}

private fun dataType() {
    println("Hello Kotlin!")
    //Byte,Short,Int,Long
    val age: Int = 20
    val population: Long = 9999
    println(age.inc())
    var name = "Hank"
    println(name.get(1))
    name = "Jack"
    //Float(32),Bouble(64)
    val weight: Float = 65.5f
    //true,false
    val isAdult = true
    //Char
    val c = 'A'
}

