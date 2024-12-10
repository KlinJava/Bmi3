package com.hank.bmi3

class Hello {

}

fun main() {
//    dataType()
    val p = Person("Jack",65.5f,17f)
    println(p.bmi())
    val hank = Person("Hank",70f,1.75f)
    println("${p.name} ${p.bmi()}")
    println("${hank.name} ${hank.bmi()}")
    p.check()
    p.hello()
    //BMI
    val w = 65.5f
    val h = 1.7f
    val bmi = w / (h * h)
    println("BMI:$bmi")

}

fun Person.check(){
    println("$name $weight $height")
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

